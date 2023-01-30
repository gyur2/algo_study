package kookmin_algo_study.second;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ17413 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack stack = new Stack();

        String str = br.readLine();
        boolean check = false;

        for (var i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '<') {
                printStack(stack);
                check = true;
                System.out.print(str.charAt(i));
            } else if (str.charAt(i) == '>') {
                check = false;
                System.out.print(str.charAt(i));
            } else if (check) {
                System.out.print(str.charAt(i));
            } else {
                if (str.charAt(i) == ' ') {
                    printStack(stack);
                    System.out.print(str.charAt(i));
                } else {
                    stack.push(str.charAt(i));
                }
            }

        }
        printStack(stack);
    }

    private static void printStack(Stack st) {
        while (!st.empty()) {
            System.out.print(st.peek());
            st.pop();
        }
    }

}