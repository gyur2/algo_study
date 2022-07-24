package bruteforce;

import java.util.Scanner;

public class BOJ2789 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int max = 0, sum = 0;

        int[] arr = new int[n+1];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    sum = arr[i] + arr[j] + arr[k];
                    if (sum > max && sum <=m){
                        max = sum;
                    }
                }
            }
        }
        System.out.println(max);
    }
}
