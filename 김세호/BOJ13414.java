// 19:00
// 19:30

// LinkedHashSet을 이용하여 순서를 유지하며 중복이 있을경우 그 중복 학번을 삭제하고 다시 add하는 방식

package 김세호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ13414 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());

        int k = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        LinkedHashSet<String> hs = new LinkedHashSet<>();

        for(int i=0; i<l; i++){
            String n = br.readLine();
            if(hs.contains(n)){
                hs.remove(n);
            }
            hs.add(n);
        }

        Iterator iter = hs.iterator();
		for(int i=0; i<k; i++){
            if(iter.hasNext()){
                System.out.println(iter.next());
            }
        }
    }
}