package kookmin_algo_study.first;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class BOJ1268 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[][] map = new int[n][5];  // 행 : 학생 수, 열 : 1~5학년
        int max = 0;  // 같은 반이었던 학생 수 최댓값
        int answer = 0;

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);
            for (int j = 0; j < 5; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < n; i++) {
            Set<Integer> sameClass = new HashSet<>(); // -> 같은 반이 였어도 다른 학년에 또 같은 반일 수 있기 때문.

            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < n; k++) {
                    if (map[i][j] == map[k][j] && k != i) {
                        sameClass.add(k);
                    }
                }
            }

            if (max < sameClass.size()) {
                max = sameClass.size();
                answer = i;
            }
        }
        System.out.println(answer + 1);
    }
}
