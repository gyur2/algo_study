package dongbinbook.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DDB6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};
        int x = 1, y = 1;
        char[] moveTypes = {'L', 'R', 'U', 'D'};

        String[] directions = br.readLine().split(" ");


        for (int i = 0; i < directions.length; i++) {
            char ch = directions[i].charAt(0);
            int nx = 0, ny = 0; // 초기화 하는 것.
            for (int j = 0; j < 4; j++) {
                if (ch == moveTypes[j]){
                    nx = x + dx[j];
                    ny = y + dy[j];
                }
            }
            if (nx < 1 || ny < 1 || nx > n | ny > n)
                continue;
            x = nx;
            y = ny;
        }
        System.out.println(x + " " + y);
    }
}
