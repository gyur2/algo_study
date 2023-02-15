package kookmin_algo_study.fourth;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class BOJ4949 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String input = br.readLine();

            if (input.equals(".")) {
                bw.flush();
                return;
            }

            bw.write(cheak(input));
        }
    }

    static String cheak(String s) {
        Stack<Character> stack = new Stack<>();
        boolean result = true;

        for (char one : s.toCharArray()) {
            if (one == '(' || one == '[') {
                stack.push(one);
            } else if (one == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    result = false;
                    break;
                }
            } else if (one == ']') {
                if (stack.isEmpty() || stack.pop() != '[') {
                    result = false;
                    break;
                }
            }
        }

        if (!stack.isEmpty()) {
            result = false;
        }

        return result ? "yes\n" : "no\n";
    }
}
