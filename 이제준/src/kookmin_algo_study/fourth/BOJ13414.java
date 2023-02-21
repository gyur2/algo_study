package kookmin_algo_study.fourth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;

public class BOJ13414 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        LinkedHashSet<String> hashSet = new LinkedHashSet<>();

        var k = Integer.parseInt(st.nextToken());
        var l = Integer.parseInt(st.nextToken());
        var max = 0;

        for (int i = 0; i < l; i++) {
            String str = br.readLine();

            if (hashSet.contains(str)){
                hashSet.remove(str);
            }
            hashSet.add(str);
        }

        for (String value : hashSet) {
            max++;
            System.out.println(value);
            if (max == k){
                break;
            }
        }
    }
}
