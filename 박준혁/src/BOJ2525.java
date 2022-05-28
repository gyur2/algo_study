import java.util.Scanner;

public class BOJ2525 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt(); // 시간
        int b = scan.nextInt(); // 분
        int c = scan.nextInt(); // 오븐설정 시간(분)
        scan.close();

        a = a + (b+c) / 60;
        if (a >= 24) {
            a = a - 24;
        }
        b = (b+c) % 60;
        System.out.print(a + " " + b);
    }
}
