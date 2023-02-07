// 19:35
// 20:20

// Heap을 사용하여 앞뒤로 중복되는 숫자들을 제거해서 새 배열에 담음 ex) 11001100110011000001 -> 101010101 (굳이 heap이 아니여도 됨.)
// 새로 만든 배열에서 맨 처음에 나오는 숫자와 다른 숫자의 개수를 셈.

package 김세호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ1439 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        Queue<Character> q = new LinkedList<Character>();
        ArrayList<Character> ch = new ArrayList<>();
        int cnt = 0;

        for(int i=0; i<s.length(); i++){
            q.add(s.charAt(i));
        }
        ch.add(q.poll());
        int c=0;
        while(!q.isEmpty()){ // 배열의 i번째와 숫자가 다르면 배열에 add, 같으면 heap에서 제거
            if(ch.get(c) != q.peek()){
                ch.add(q.poll());
                c++;
            } else {q.poll();}
        }
        if(ch.get(0) == '0'){ // 배열의 0번째와 다른 숫자의 개수를 찾는 과정
            for(int i=0; i<ch.size(); i++){
                if(ch.get(i) == '1') cnt++;
            }
        } else {
            for(int i=0; i<ch.size(); i++){
                if(ch.get(i) == '0') cnt++;
            }
        }
        System.out.print(cnt);
    }
}