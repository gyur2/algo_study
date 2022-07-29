package datastruct;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ17299 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] count = new int[1_000_001];
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            count[arr[i]]++;
        }

        for (int i = 0; i < n; i++) {
            while (!stack.empty() && count[arr[i]] > count[arr[stack.peek()]]){
                arr[stack.pop()] = arr[i];
            }
            stack.push(i);
        }
        while (!stack.empty()){
            arr[stack.pop()] = -1;
        }
        for (int i = 0; i < n; i++) {
            sb.append(arr[i]).append(' ');
        }
        System.out.println(sb);
    }
}
