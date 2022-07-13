import java.util.Scanner;

public class BOJ2839 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int cnt = 0;

        while(true) {

            if(num % 5 == 0) {
                cnt += num / 5; // cnt 에 num / 5 값을 저장 후 출력
                break;
            } else { // num % 5 가 0 이 아닐시 num에 3을 뺀 후에 다시 반복
                num -= 3;
                cnt++; // cnt 에 1증가
            }

            if(num < 0) { // num이 0보다 작을 시 cnt에 저장 후 -1 출력
                cnt = -1;
                break;
            }

        }

        System.out.println(cnt);
        scan.close();
    }
}
