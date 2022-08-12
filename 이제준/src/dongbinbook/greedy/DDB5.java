package dongbinbook.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.Scanner;

public class DDB5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][m];

        int[] value = new int[n];

        StringTokenizer st2;
        for (int i = 0; i < n; i++) {
            st2 =  new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st2.nextToken());
            }
        }

        for (int i = 0; i < n; i++) {
            int max = arr[i][0];
            for (int j = 1; j < m; j++) {
                if (max >= arr[i][j]) {
                    value[i] = arr[i][j];
                }
                max = value[i];
            }
        }
        Arrays.sort(value);
        System.out.println(value[value.length-1]);

        // 동빈 나의 풀이
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int result = 0;

        // 한 줄씩 입력 받아 확인하기
//            for (int i = 0; i < n; i++) {
//                // 현재 줄에서 '가장 작은 수' 찾기
//                int min_value = 10001;
//                for (int j = 0; j < m; j++) {
//                    int x = sc.nextInt();
//                    min_value = Math.min(min_value, x);
//                }
//                // '가장 작은 수'들 중에서 가장 큰 수 찾기
//                result = Math.max(result, min_value);
//            }
//            System.out.println(result); // 최종 답안 출력`
    }

}
