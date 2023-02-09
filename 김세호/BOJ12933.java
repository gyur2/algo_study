// 20:40
// 22:40 실패

// arrayList의 맨 처음부터 q다음에 u를 찾고 u다음에 a를 찾고 를 반복. 찾을때마다 그 char는 삭제.
// arrayList의 길이만큼 반복하면 한번 왕복하는 동안 한마리의 오리가 외치는 quack을 모두 찾음.
// 위 과정이 한번 끝날때마다 count하면서 arrayList가 empty될 때 까지 반복.
// quack가 만들어지지 않을때는 IndexOutOfBounds가 뜨는데 이를 try-catch로 잡아서 -1이 출력되도록 함.
// 시간초과로 실패

package 김세호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ12933 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        ArrayList<Character> al = new ArrayList<Character>();

        for(int i=0; i<s.length(); i++){
            al.add(s.charAt(i));
        }

        String quack = "";
        int cnt = 0;

        while(!al.isEmpty()){
            int size = al.size();
            try{
                for(int i=0; i<al.size(); i++){
                    if (size != al.size()) {
                        size = al.size();
                        i--;
                    }
                    if (al.get(0) != 'q'){
                        cnt = -1;
                        break;
                    }
                    if(quack.equals("") && al.get(i) == 'q'){
                        quack += al.get(i);
                        al.remove(i);
                    }
                    if(quack.equals("q") && al.get(i) == 'u'){
                        quack += al.get(i);
                        al.remove(i);
                    }
                    if(quack.equals("qu") && al.get(i) == 'a'){
                        quack += al.get(i);
                        al.remove(i);
                    }
                    if(quack.equals("qua") && al.get(i) == 'c'){
                        quack += al.get(i);
                        al.remove(i);
                    }
                    if(quack.equals("quac") && al.get(i) == 'k'){
                        quack += al.get(i);
                        al.remove(i);
                    }
                    if(quack.equals("quack")){
                        quack = "";
                    }
                }
                if(cnt == -1) break;
                cnt ++;
            } catch(IndexOutOfBoundsException e){
                cnt = -1;
            }
        } System.out.print(cnt);
    }
}