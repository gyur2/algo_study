import java.util.Scanner;

public class BOJ2292 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int count = 1;
        int range = 2;

        if (n == 1) {
            System.out.print(1); // 입력받은 값이 1 일때 실행
        }

        else {
            while (range <= n) {
                range = range + (6 * count); // 1을 제외 2부터 방의 개수가 6씩 늘어남
                count++;
            }
            System.out.print(count);
        }
        scan.close();
    }
}
