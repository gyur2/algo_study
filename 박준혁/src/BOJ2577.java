import java.util.Scanner;

public class BOJ2577 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();

        int result = A*B*C;
        String str = Integer.toString(result);
        scan.close();

        for(int i = 0; i < 10; i++){ // 0~9 숫자 검사 for문
            int cnt = 0;

            for(int j = 0; j < str.length(); j++){
                if(str.charAt(j)-'0' == i){
                    // charAt 는 문자열 몇 번째 데이터 출력
                    // 0~9까지 검사하는 i 랑 동일 
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}
// 10
