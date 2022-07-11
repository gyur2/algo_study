package math1;

import java.util.Scanner;

public class BOJ1193 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int cross = 1;
        int prev_count_sum = 0;

        while (true){
            if (x <= prev_count_sum + cross){
                if (cross % 2 == 1){
                    System.out.println(cross - (x - prev_count_sum - 1) + "/" + (x - prev_count_sum));
                    break;
                } else {
                    System.out.print((x - prev_count_sum) + "/" + (cross - (x - prev_count_sum - 1)));
                    break;
                }
            } else {
                prev_count_sum += cross;
                cross++;
            }
        }
    }
}
