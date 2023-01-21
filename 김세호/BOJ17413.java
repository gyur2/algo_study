// 11:50
// 12:35

// Tag가 아닌 부분의 단어를 뒤집기 위해서는 stack을 사용
// 그 외에는 '<', '>', ' '을 확인해서 if-else문으로 조건걸어주기

package 김세호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ17413 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int len = 0;
        Stack<Character> st = new Stack<>();

        boolean isTag = false;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '<'){ // 뒤집으면 안되는 Tag의 시작부분을 먼저 체크
                while(s.charAt(i) != '>'){
                    System.out.print(s.charAt(i));
                    i++;
                }
                System.out.print('>');
            }
            else{
                while(s.charAt(i) != ' '){ // 공백이 생길때까지 스택에 넣고
                    if(s.charAt(i) == '<'){
                        i--;
                        isTag = true;
                        break;
                    }
                    st.push(s.charAt(i));
                    i++;
                    if(i == s.length()) break;
                }
                while(!st.empty()){ // 공백이 생겼다면 스택의 char들을 pop해서 출력
                    System.out.print(st.pop());
                }
                if(isTag) {
                    isTag = false;
                    continue;}
                System.out.print(' ');
            }
        }
    }
}