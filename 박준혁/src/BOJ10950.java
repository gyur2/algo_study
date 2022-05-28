import java.util.Scanner;

public class BOJ10950 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int size = scan.nextInt();

        for(int i = 0; i<size; i++){
            num1 = scan.nextInt();
            num2 = scan.nextInt();
            System.out.println(num1 + num2);
        }
        scan.close();
    }
}
// 5분