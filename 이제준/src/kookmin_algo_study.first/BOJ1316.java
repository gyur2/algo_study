package kookmin_algo_study.first;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1316 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static boolean strCheck() throws IOException {
        boolean[] strCheck = new boolean[26];
        int prev = 0;
        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            int cur = str.charAt(i);

            if (prev != cur){
                if (!strCheck[cur - 'a']){
                    strCheck[cur - 'a'] = true;
                    prev = cur;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        int cnt = 0;
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            if (strCheck()){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
