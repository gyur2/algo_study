import java.util.Scanner;

public class BOJ8958 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();

        String str; // OX 문자열 담을 String 선언
        for(int i = 0; i < size; i++){ // size 만큼 반복 출력
            str = scan.next();
            int sum = 0, cnt = 0; // 점수, 연속 O문자 셀 cnt 변수 선언 위에 반복 끝날시 초기화
            for(int j = 0; j < str.length(); j++){
                if(str.charAt(j) == 'O'){ // 해당 인덱스 자리가 O 인지 확인
                    cnt++;                // O일시 cnt 1증가, sum 에 더함
                    sum += cnt;           // 다음에도 O일시 1증가 sum 더함
                }else{                    // 아닐시 cnt 초기화
                    cnt = 0;
                }
            }
            System.out.println(sum);
        }
    }
}
// 30