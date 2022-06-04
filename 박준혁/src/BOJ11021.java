import java.util.Scanner;

public class BOJ11021 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        int size = scan.nextInt();

        for(int i = 1; i<=size; i++){
            num1 = scan.nextInt();
            num2 = scan.nextInt();
            System.out.println("Case #" + i + ": " + (num1+num2));
        }
    }
}
// 3분