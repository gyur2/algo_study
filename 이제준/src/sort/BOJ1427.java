package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class BOJ1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
//        char[] ch = str.toCharArray();
//
//        Arrays.sort(ch);
//        for (int i = ch.length-1; i >= 0; i--) {
//            System.out.print(ch[i]);
//        }
        String[] arr = str.split("");
        Arrays.sort(arr, Collections.reverseOrder());

        for (String s : arr) {
            System.out.print(s);
        }
    }
}
