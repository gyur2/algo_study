// 18:35
// 19:05

// sort를 오버라이딩해서 길이가 같을때랑 다를때를 구분해서 정렬

package 김세호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ1181 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        HashSet<String> hset = new HashSet<String>();

        for(int i=0; i<n; i++){
            hset.add(br.readLine());
        }

        ArrayList<String> arr = new ArrayList<>(hset);

        Collections.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2){
                if(s1.length() == s2.length()){ // 길이가 같다면 알파벳 순으로 정렬
                    return s1.compareTo(s2);
                } else {
                    return s1.length() - s2.length(); // 길이가 다르다면 길이순으로 정렬
                }
            }
        });

        for(String s : arr){
            System.out.println(s);
        }
    }
}