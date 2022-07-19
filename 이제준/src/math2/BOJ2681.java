package math2;

import java.util.Scanner;

public class BOJ2681 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int min = Integer.MAX_VALUE;

        int sum = 0;

        for (int i = n; i <= m; i++) {
            if (isPrime(i)) {
                sum += i;
                if (i < min){
                    min = i;
                }
            }
        }
        if (sum == 0){
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }

    private static boolean isPrime(int i) {
        if (i < 2){
            return false;
        }
        if (i == 2){
            return true;
        }
        for (int j = 2; j < i; j++) {
            if (i % j == 0){
                return false;
            }
        }
        return true;
    }
}
