package array;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // 정렬을 통해 최대 최소 뽑아낼 수 있음.
        Arrays.sort(arr);
        System.out.println(arr[0] + " " + arr[n-1]);
    }
}
