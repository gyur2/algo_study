import java.util.Scanner;

public class BOJ1712 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt(); // 고정비용 1000
        int b = scan.nextInt(); // 재료비   70
        int c = scan.nextInt(); // 판매가   170

        if (c <= b) {
            System.out.println("-1");
        }
        else {
            System.out.println((a/(c-b))+1);
        }
        scan.close();
    }
}
