package dongbinbook.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DDB7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < 60; j++) {
                for (int k = 0; k < 60; k++) {
                    if (check(i,j,k)) cnt++;
                }
            }
        }
        System.out.println(cnt);
    }

    private static boolean check(int h, int m, int s) {
        // 시 분 초에서 십의 자리 수와 일의 자리수가 3이지 체크.
        if (h % 10 == 3 || m % 10 == 3 || m / 10 == 3 || s % 10 == 3 || s / 10 == 3 )
            return true;
        return false;
    }
}
