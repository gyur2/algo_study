import java.util.Scanner;

public class BOJ2739 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        scan.close();

        for(int i = 1; i<10; i++){
            System.out.println(num + " * " + i + " = " + num*i);
        }
    }
}
// 2분