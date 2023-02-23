// 카드 정렬하기
// 13:55
// 15:00

// min heap인 priority queue에서 두개 poll한 값을 더해서 다시 priority queue에 넣고 더해서 pq가 empty될때까지 loop

package 김세호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ1715 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        ArrayList<Integer> al = new ArrayList<>(); // 비교한 횟수들을 모은 array list

        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            pq.add(Integer.parseInt(br.readLine()));
        }
        int cnt = 0;
        if(pq.size() == 1){ // 카드 뭉치가 1개일때
            cnt = 0;
        } else{
            while(true){
                int i = pq.poll() + pq.poll();
                al.add(i);
                if(pq.isEmpty()){
                    break;
                }
                pq.add(i); // 합친 카드뭉치를 다시 priority queue에 넣어서 min heap 정렬
            }
            for(int i : al){
                cnt += i;
            }
        }
        System.out.println(cnt);
    }
}