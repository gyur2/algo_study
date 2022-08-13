package dongbinbook.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DDB8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int row = str.charAt(1) - '0';
        int col = str.charAt(0) - 'a' + 1;

        int[] dx = {-2, -2, -1, 1, 2, 2, 1 ,-1};
        int[] dy = {1, -1, -2, -2, -1, 1, 2, 2};

        int result = 0;
        for (int i = 0; i < 8; i++) {
            int nextRow = row + dx[i];
            int nextCol = col + dy[i];
            if (nextRow <= 8 && nextRow >= 1 && nextCol >= 1 && nextRow <=8){
                result++;
            }
        }
        System.out.println(result);
    }
}
