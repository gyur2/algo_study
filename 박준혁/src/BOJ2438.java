import java.util.Scanner;

public class BOJ2438 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        in.close();

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
// 3분