package datastruct;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ17413 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<Character>();

        boolean tag = false;

        StringBuilder sb = new StringBuilder();
        String input = br.readLine();

        for(char ch : input.toCharArray()) {
            if(ch == '<') {
                tag = true;
                while(!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
                sb.append("<");
            }else if (ch == '>') {
                tag = false;
                sb.append(">");
            }else if (ch == ' ') {
                while(!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
                sb.append(" ");
            }else {
                if(!tag) stack.push(ch);
                else sb.append(ch);
            }
        }
        while(!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        System.out.println(sb);
    }
}