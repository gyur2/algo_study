package loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        int t = n;

        while (true){
            n = ((n % 10) * 10) + (((n / 10) + (n % 10)) % 10);
            cnt++;

            if (n == t){
                break;
            }
        }
        System.out.println(cnt);


    }
}
