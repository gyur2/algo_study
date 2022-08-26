package dongbinbook.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DDB10 {
    public static int n, m, x, y, direction;

    public static int dx[] = {-1, 0, 1, 0};
    public static int dy[] = {0, 1, 0, -1};

    public static int[][] d = new int[50][50];
    public static int[][] arr = new int [50][50];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        x = Integer.parseInt(st2.nextToken());
        y = Integer.parseInt(st2.nextToken());
        direction = Integer.parseInt(st2.nextToken());

        for (int i = 0; i < n; i++) {
            StringTokenizer st3 = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st3.nextToken());
            }
        }

        int cnt = 1;
        int turn_time = 0;
        while (true) {
            turn_left();
            int nx = x + dx[direction];
            int ny = y + dy[direction];
            if (d[nx][ny] == 0 && arr[nx][ny] == 0) {
                d[nx][ny] = 1;
                x = nx;
                y = ny;
                cnt += 1;
                turn_time = 0;
                continue;
            }
            else turn_time += 1;
            if (turn_time == 4){
                nx = x - dx[direction];
                ny = y - dy[direction];
                if (arr[nx][ny] == 0) {
                    x = nx;
                    y = ny;
                }
                else break;
                turn_time = 0;
            }
        }
        System.out.println(cnt);
    }
    private static void turn_left() {
        direction -= 1;
        if (direction == -1) {
            direction = 3;
        }
    }

}
