package kookmin_algo_study.second;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        sb.append('<');

        var n = Integer.parseInt(st.nextToken());
        var k = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();

        for (var i = 1; i <= n; i++) {
            queue.offer(i);
        }

        while (queue.size() > 1){
            for (var i = 0; i < k - 1; i++) {
                queue.offer(queue.poll());
            }
            sb.append(queue.poll()).append(", ");
        }

        sb.append(queue.poll()).append('>');
        System.out.println(sb);
    }
}
