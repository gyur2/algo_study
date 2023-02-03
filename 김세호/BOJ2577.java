// 15:50
// 16:00

package 김세호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2577 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        int n = a * b * c;
        int arr[] = new int[10];

        while(n >= 1){
            arr[n%10]++;
            n /= 10;
        }
        for(int i : arr){
            System.out.println(i);
        }
    }
}