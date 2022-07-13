package inflearn;

import java.util.Scanner;

public class Array7 {
    public static void main(String[] args) {
        Array7 T = new Array7();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution(n, arr));
    }
    public int solution(int n, int[] arr){
        int cnt = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1){
                cnt++;
                sum += cnt;
            } else {
                cnt = 0;
            }
        }
        return sum;
    }
}

