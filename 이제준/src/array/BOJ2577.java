package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int j = Integer.parseInt(br.readLine());

        int value = n * m * j;
        String str = String.valueOf(value);

        int[] arr = new int[10];

        for (int i = 0; i < str.length(); i++) {
            arr[(str.charAt(i) - '0')]++;
        }
        for(int v : arr){
            System.out.println(v);
        }

    }
}
