package datastruct;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ1918 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char prev = str.charAt(i);

            switch (prev){
                case '+':
                case '-':
                case '/':
                case '*':
                    while (!stack.empty() && priority(stack.peek()) >= priority(prev)){
                        sb.append(stack.pop());
                    }
                    stack.push(prev);
                    break;
                case '(':
                    stack.push(prev);
                    break;
                case ')':
                    while (!stack.empty() && stack.peek() != '('){
                        sb.append(stack.pop());
                    }
                    stack.pop();
                    break;
                default:
                    sb.append(prev);
            }
        }
        while (!stack.empty()) {
            sb.append(stack.pop());
        }
        System.out.println(sb);
    }

    private static int priority(Character ch) {
        if (ch == '(' || ch == ')'){
            return 0;
        } else if (ch == '+' || ch == '-'){
            return 1;
        } else if (ch == '*' || ch == '/'){
            return 2;
        }
        return -1;
    }
}
