package conditional;

import java.util.Scanner;

public class BOJ14681 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        if (n > 0 && m > 0){
            System.out.println(1);
        } else if (n > 0 && m < 0){
            System.out.println(4);
        } else if (n < 0 && m > 0){
            System.out.println(2);
        } else if (n <0 && m < 0){
            System.out.println(3);
        }
    }
}
