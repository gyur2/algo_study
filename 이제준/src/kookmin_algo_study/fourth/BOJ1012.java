package kookmin_algo_study.fourth;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1012 {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] arr;
    static int n;
    static int m;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        var t = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for (var c = 0; c < t; c++) {
            String str = br.readLine();
            st = new StringTokenizer(str);

            m = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            var K = Integer.parseInt(st.nextToken());

            var count = 0;

            arr = new int[n][m];

            for (var i = 0; i < K; i++) {
                String[] value = br.readLine().split(" ");
                arr[Integer.parseInt(value[1])][Integer.parseInt(value[0])] = 1;
            }

            for (var i = 0; i < n; i++) {
                for (var j = 0; j < m; j++) {
                    if (arr[i][j] != 0) {
                        dfs(i, j);
                        count++;
                    }
                }
            }

            System.out.println(count);

        }
    }

    public static void dfs(int X, int Y) {
        for (var i = 0; i < 4; i++) {
            var nX = X + dx[i];
            var nY = Y + dy[i];

            if (nX < 0 || nY < 0 || nX >= n || nY >= m) {
                continue;
            }

            if (arr[nX][nY] == 0) {
                continue;
            }
            arr[nX][nY] = 0;
            dfs(nX, nY);
        }
    }
}
