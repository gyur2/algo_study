import java.util.Scanner;

public class BOJ1065 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println(NumberCount(scan.nextInt()));
        scan.close();
    }

    private static int NumberCount(int N) {

        int cnt = 0; // 한수 변수

        if(N<100) {
            return N; // 99까지의ㅣ 숫자는 등차수열
        }else {
            cnt = 99;

            for(int i=100; i<=N; i++) {

                int A = i / 100;        // 백의 자릿수 구하기
                int B = (i / 10) % 10;  // 십의 자릿수 구하기
                int C = i % 10;         // 일의 자릿수 구하기

                if(B-A == C-B) {        // 각각 자릿수의 공차가 똑같을 시 cnt++
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
// 20