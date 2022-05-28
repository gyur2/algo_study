import java.util.Scanner;

public class BOJ10952 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true){
            int num1 = scan.nextInt();
            int num2 = scan.nextInt();

            if(num1 == 0 && num2 == 0){
                break;
            }else{
                System.out.println(num1 + num2);
            }
        }
        scan.close();
    }
}
// 9 분