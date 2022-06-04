package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ8985 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] strArr = new String[n];

        for (int i = 0; i < n; i++) {
            strArr[i] = br.readLine();
        }
        for (int i = 0; i < n; i++) {
            int count = 0;
            int sum = 0;
            for (int j = 0; j < strArr[i].length(); j++){
                if (strArr[i].charAt(j) == 'O'){
                    count++;
                } else {
                    count = 0;
                }
                sum += count;
            }
            System.out.println(sum);
        }
    }
}
