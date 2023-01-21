// 13:40
// 15:40

// queue를 이용하여 앞에서부터 k-1개만큼 빼서 뒤로 다시 삽입하고 출력
package 김세호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ1158 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Queue<Integer> q = new LinkedList<Integer>();

        for(int i=1; i<=n; i++){
            q.add(i);
        }
        System.out.print('<');

        while(q.size() > 1){
            for(int i = 0; i < k-1; i++){
                q.add(q.poll());
        }
            System.out.print(q.poll() + ", ");
        }
        System.out.print(q.poll());
        System.out.print('>');
    }
}