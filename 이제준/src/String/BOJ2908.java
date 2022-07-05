package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int str1 = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
        int str2 = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());

        System.out.print(Math.max(str1, str2));
    }
}
