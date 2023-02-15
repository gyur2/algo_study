// 스택수열

// 20:20
// 2시간 + α

// 수열을 만들 수 없다면 NO를 출력해야하기 때문에 push, pop할때마다 +,-를 바로 출력하는 것이 아닌 arrayList에 저장해놓고
// 마지막에 수열을 만들 수 있는지 없는지 여부를 판단 후, arrayList에 저장된 String들을 꺼내서 출력.

package 김세호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ1874 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Integer> stack = new Stack<>();
        ArrayList<String> al = new ArrayList<>(); // push, pop할때마다 +, -를 저장할 배열
        int n = Integer.parseInt(br.readLine());

        int arr[] = new int[n]; // 입력받은 수열을 저장할 배열

        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        int iter=0;
        boolean comp = true;
        int num = 1; // stack에 1부터 넣기위해 사용하는 변수
        stack.push(0);

        while(true){
            if(stack.peek() == arr[iter]){ // stack의 최상단이 비교할 배열의 iter번째와 같다면 pop
                stack.pop();
                al.add("-");
                iter++;
                if(iter == n){break;}
                continue;
            }
            stack.push(num);
            al.add("+");
            num++;
            if(num>n+1) {  // 만약 수열을 만들지 못한다면 num이 무한으로 증가하는데, 이를 이용하여 n보다 커지면 수열을 만들수 없다고 판단.
                comp = false;
                break;
            }
        }
    
        if(comp){
            for(String s : al){
                System.out.println(s);
            }
        } else{
            System.out.println("NO");
        }
    }
}