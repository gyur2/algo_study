import java.util.Scanner;

public class BOJ10951 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNextInt()) { // hashNextInt -> scan이 정수로 넘어오면 true 아닐시 false
            int num1 = scan.nextInt();
            int num2 = scan.nextInt();

            System.out.println(num1 + num2);
        }
        scan.close();
    }
}
// 12분