import java.util.Scanner;

public class BOJ2775 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] apt = new int[15][15];

        for(int i = 0; i < 15; i++) { // 15까지의 for문
            apt[i][1] = 1; // i층 1호를 저장
            apt[0][i] = i; // 0층 i호를 저장
        }

        for(int i = 1; i < 15; i++) {
            for(int j = 2; j < 15; j++) {
                apt[i][j] = apt[i][j - 1] + apt[i - 1][j];
             // ex) apt[1][2] = apt[1][1] + apt [0][2] 식으로 반복하게 된다 -- 0층의 사람들부터 더하는 누적합
            }
        }

        int T = scan.nextInt();

        for(int k = 0; k < T; k++) {
            int f = scan.nextInt();
            int n = scan.nextInt();
            System.out.println(apt[f][n]);
        }
        scan.close();
    }
}
