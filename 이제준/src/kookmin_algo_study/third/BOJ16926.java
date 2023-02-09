package kookmin_algo_study.third;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ16926 {

    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int r = Integer.parseInt(st.nextToken());
        int[][] map = new int[n][m];

        // 값 받아오기
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int rCount = Math.min(n, m);

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < rCount / 2; j++) {
                int x = j;
                int y = j;

                int temp = map[x][y];

                int dir = 0;
                while (dir < 4) {
                    int xx = x + dx[dir];
                    int yy = y + dy[dir];
                    if (xx >= j && xx < n - j && yy >= j && yy < m - j) {
                        map[x][y] = map[xx][yy];
                        x = xx;
                        y = yy;
                    } else {
                        dir++;
                    }
                }
                map[j + 1][j] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}
