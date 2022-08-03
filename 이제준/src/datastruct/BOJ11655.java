package datastruct;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ11655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        char[] str = br.readLine().toCharArray();
        for (int i = 0; i < str.length; i++) {
            if (str[i] >= 'A' && str[i] <= 'Z') {
                if (str[i] >= 'N') {
                    str[i] -= 13;
                } else {
                    str[i] += 13;
                }
            } else if (str[i] >= 'a' && str[i] <= 'z') {
                if (str[i] >= 'n') {
                    str[i] -= 13;
                } else {
                    str[i] += 13;
                }
            }
        }

        for (char i : str){
            sb.append(i);
        }

        System.out.println(sb);
    }
}
