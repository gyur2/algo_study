import java.util.Scanner;

public class BOJ2675 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        for(int i1 = 0; i1 < A; i1++) { // A 범위까지 반복

            int count = scan.nextInt();
            
            String str = scan.next();

            for(int i2 = 0; i2 < str.length(); i2++) { // str.length() 만큼 반복
                for(int i3 = 0; i3 < count; i3++) {    // \count 범위까지 반복
                    System.out.print(str.charAt(i2));  // 한글자씩 출력
                }
            }

            System.out.println(); // 공백출력
        }
        scan.close();
    }
}
