import java.util.Scanner;

public class BOJ11720 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        String str = scan.next();

        int sum =  0;
        for(int i = 0; i < num; i++){
            sum += str.charAt(i) - '0';
        }
        System.out.println(sum);
        scan.close();
    }
}
