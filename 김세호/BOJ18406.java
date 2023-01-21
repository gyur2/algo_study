// 18:20
// 18:35
package 김세호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ18406 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int copyN = n;

        int mid = 1;
        while(copyN / 10 >= 1) {
            copyN /= 10;
            mid++;
        }
        int left = 0;
        int right = 0;

        for(int i=0; i<mid; i++){
            if(mid % 2 == 0){
                if(i < mid/2){
                    right += n % 10;
                    n /= 10;
                }
                if(i >= mid/2){
                    left += n % 10;
                    n /= 10;
                }
            } else {
                if (i == mid / 2) {
                    n /= 10; 
                    continue;
                }
                if(i < mid/2){
                    right += n % 10;
                    n /= 10;
                }
                if(i > mid/2){
                    left += n % 10;
                    n /= 10;
                }
            }
        }
        if(right == left) System.out.print("LUCKY");
        else System.out.print("READY");
    }
}
