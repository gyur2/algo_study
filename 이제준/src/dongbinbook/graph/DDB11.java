package dongbinbook.graph;

import java.io.*;
import java.util.StringTokenizer;

public class DDB11 {
    public static int[][] arr;
    public static int n; // 행
    public static int m; // 렬

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int answer = 0;

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++) {
                arr[i][j] = str.charAt(j) - '0';
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (dfs(i, j)){
                    answer++;
                }
            }
        }
        bw.write(String.valueOf(answer));
        bw.close();
    }

    private static boolean dfs(int i, int j) {
        if (i < 0 || i >= n || j < 0 || j >= m){
            return false;
        }
        if (arr[i][j] == 0){
            arr[i][j] = 1;

            dfs(i + 1, j);
            dfs(i - 1, j);
            dfs(i, j + 1);
            dfs(i, j - 1);

            return true;
        }
         return false;
    }
}
