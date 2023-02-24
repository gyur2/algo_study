// 19:45
// 20:00

// contains의 시간복잡도가 낮은 hashset을 이용하여 듣도못한사람과 보도못한 사람의 중복을 확인해서 arraylist에 넣고 sorting

package 김세호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ1764 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashSet<String> seen = new HashSet<>();
        HashSet<String> heard = new HashSet<>();
        ArrayList<String> al = new ArrayList<>();

        for(int i=0; i<n; i++){
            heard.add(br.readLine());
        }
        for(int i=0; i<m; i++){
            seen.add(br.readLine());
        }

        if(n<m){ // 시간을 줄이기 위해 사람의 수가 더 적은 쪽에서 for문을 돌려 포함여부를 확인.
            for(String s : seen){
                if(heard.contains(s)){
                    al.add(s);
                }
            }
        } else{
            for(String s : heard){
                if(seen.contains(s)){
                    al.add(s);
                }
            }
        }

        Collections.sort(al);
        System.out.println(al.size());
        for(String s : al){
            System.out.println(s);
        }
    }
}