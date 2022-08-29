package graph;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ13023 {
    public static int n = 0;
    public static int m = 0;
    public static ArrayList<Integer>[] list;
    public static boolean[] visited;
    public static int result = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        visited = new boolean[n];

        list = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list[a].add(b);
            list[b].add(a);
        }

        for (int i = 0; i < n; i++) {
            visited[i] = true;
            dfs(i, 0);
            visited[i] = false;

            if(result == 1){
                break;
            }
        }
        bw.write(String.valueOf(result));
        bw.flush();
    }

    private static void dfs(int x, int i) {
        if (i >= 4) {
            result = 1;
            return;
        }
        visited[x] = true;
        for (int j = 0; j < list[x].size(); j++) {
            int temp = list[x].get(j);
            if (!visited[temp]) {
                dfs(temp, i + 1);
                visited[temp] = false;
            }
        }
    }
}
