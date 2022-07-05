import java.util.Scanner;

public class BOJ10809 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        for (char  c= 'a'; c<='z'; c++ ){ // a-z 까지 반복문
            System.out.print(str.indexOf(c)+" "); // indexOf() 입력 받은 문자열의 위치를 찾고 출력
        }
        scan.close();
    }
}
