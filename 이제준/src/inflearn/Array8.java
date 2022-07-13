package inflearn;

import java.util.Scanner;

public class Array8 {
    public static void main(String[] args) {
        Array8 T = new Array8();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i : T.solution(n, arr)) {
            System.out.print(i + " ");
        }
    }
    public int[] solution(int n, int[] arr){
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            int cnt = 1;
            for (int j = 0; j < n; j++) {
                if (arr[j] > arr[i]){
                    cnt++;
                }
                answer[i] = cnt;
            }
        }
        return answer;
    }
}
