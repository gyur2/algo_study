// 18:40

package 김세호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;

public class BOJ1920 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        LinkedHashSet<Integer> hset = new LinkedHashSet<Integer>();
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            hset.add(Integer.parseInt(st.nextToken()));
        }

        int m = Integer.parseInt(br.readLine());
        LinkedHashSet<Integer> hset2 = new LinkedHashSet<Integer>();
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<m; i++){
            hset2.add(Integer.parseInt(st.nextToken()));
        }

        int isExist[] = new int[m];

        int cnt = 0;
        Iterator iter = hset2.iterator();
        while(iter.hasNext()){
            if(hset.contains(iter.next())){
                isExist[cnt] = 1;
                cnt++;
            } else {
                isExist[cnt] = 0;
                cnt++;
            }
        }

        for(int i=0; i<m; i++){
            System.out.println(isExist[i]);
        }
    }
}
