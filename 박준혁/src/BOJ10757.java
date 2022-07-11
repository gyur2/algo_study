import java.math.BigInteger; // long 타입으로 안됨. Java에선 BigInteger를 지원
import java.util.Scanner;

public class BOJ10757 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger A = scan.nextBigInteger();
        BigInteger B = scan.nextBigInteger();
        System.out.println(A.add(B));
        scan.close();
    }
}
