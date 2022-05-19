import java.util.Scanner;

public class BOJ1929 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int M = scan.nextInt();
        int N = scan.nextInt();
        scan.close();

        boolean isPrime = true;

        // M이 1과 0인 경우는 제외
        if(M == 1) {
            M += 1;
        }
        else if (M == 0) {
            M += 2;
        }

        for(int i = M; i <= N; i++) {
            for(int j = 2; j*j <= i; j++) {
                if( i%j == 0 ) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                System.out.println(i);
            }
            isPrime = true;

        }

    }
}
