import java.util.Scanner;

public class BOJ10250 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();

        for(int i = 0; i < T; i++) {
            int H = scan.nextInt();  // 층
            int W = scan.nextInt();
            int N = scan.nextInt();  // N번째 손님

            int x = (N/H) + 1;
            int y = N%H;

            if(N%H == 0) {
                x = N/H;
                y = H;
            }
            System.out.println(y * 100 + x);
        }
        scan.close();
    }
}
