import java.util.Scanner;

public class BOJ1157 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int apb[] = new int[26]; // A~Z까지 0~25에 저장할 배열
        String str = scan.next();
        str = str.toUpperCase(); // 대소문자를 대문자로 모두 전환

        for(int i=0; i<str.length(); i++){
            apb[str.charAt(i)-'A']++; // 나온 단어에 해당하는 인덱스의 정수 값을 1씩 증가
        }

        int max = 0, ans=0;
        for(int i=0; i<apb.length; i++){
            if(max < apb[i]){ // 지금까지 나온 최빈값이랑 현재 인덱스의 저장된 값이랑 비교(가장 많이 사용된 알파벳 찾는 조건문)
                max = apb[i];
                ans = i;
            }
            else if(max == apb[i]){
                ans = -2; // ascii코드에서 ?는 A보다 2가 작기 때문
            }
        }
        System.out.printf("%s", Character.toString(ans+'A'));
        scan.close();
    }
}
