package kookmin_algo_study.second;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ15649 {
    public static int n;
    public static int m;
    public static int[] list;
    public static boolean[] visited;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        list = new int[m];
        visited = new boolean[n];

        dfs(0);
        System.out.println(sb);
    }
    public static void dfs(int depth) {
        if (depth == m) {
            for (var val : list) {
                sb.append(val).append(' ');
            }
            sb.append('\n');
            return;
        }

        for (var i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                list[depth] = i + 1;
                dfs(depth + 1);
                visited[i] = false;
            }
        }
    }
}
