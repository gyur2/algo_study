package datastruct;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ1406 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int n = Integer.parseInt(br.readLine());

        Stack<String> leftStack = new Stack<>();
        Stack<String> rightStack = new Stack<>();

        String[] arr = str.split("");

        for (String s : arr) {
            leftStack.push(s);
        }

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String command = st.nextToken();

            switch (command){
                case "L":
                    if (!leftStack.empty()){
                        rightStack.push(leftStack.pop());
                    }
                    break;
                case "D":
                    if (!rightStack.empty()){
                        leftStack.push(rightStack.pop());
                    }
                    break;
                case "B":
                    if (!leftStack.empty()){
                        leftStack.pop();
                    }
                    break;
                case "P":
                    leftStack.push(st.nextToken());
                    break;
            }
        }
        while (!leftStack.empty()){
            rightStack.push(leftStack.pop());
        }
        while (!rightStack.empty()){
            bw.write(rightStack.pop());
        }
        bw.flush();
        bw.close();
    }
}
