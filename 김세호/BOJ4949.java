// 균형잡힌 세상
// 17:35
// 17:50

// stack을 이용해서 [ 또는 ( 가 나올때마다 stack에 저장한다.
// ] 또는 )가 나왔는데 stack.pop을 해도 그에 맞는 괄호가 나오지 않는다면 no를 출력

package 김세호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ4949 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        

        while(true){
            String s = br.readLine();
            boolean b = false;

            if(s.equals(".")) break;

            Stack<Character> st = new Stack<>();

            for(int i=0; i<s.length(); i++){
                if(s.charAt(i) == '[' || s.charAt(i) == '('){
                    st.push(s.charAt(i));
                }
                if(s.charAt(i) == ']'){
                    if(st.empty() || st.pop() != '['){
                        System.out.println("no");
                        b = true;
                        break;
                    }
                }
                if(s.charAt(i) == ')'){
                    if(st.empty() || st.pop() != '('){
                        System.out.println("no");
                        b = true;
                        break;
                    }
                }
            }
            if(b){
                b = false;
                continue;
            }

            if(st.empty()){
                System.out.println("yes");
                continue;
            } else{
                System.out.println("no");
                continue;
            }
        }
    }
}
