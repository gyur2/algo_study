import java.util.Scanner;

public class BOJ10871 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int size = scan.nextInt();
        int num = scan.nextInt();

        for(int i = 0; i<size; i++){
            int num2 = scan.nextInt();
            if(num2 < num){
                System.out.print(num2 + " ");
            }
        }
        scan.close();
    }
}
// 8분
