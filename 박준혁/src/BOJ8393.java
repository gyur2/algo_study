import java.util.Scanner;

public class BOJ8393 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        scan.close();
        int sum = 0;

        for(int i = 1; i<=num; i++){ // 1부터.. 0으로 시작하다 틀림
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
// 5분