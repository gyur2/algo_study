import java.util.Scanner;

public class BOJ2941 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str[] = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="}; // 배열생성
        String A =  scan.nextLine();

        for(int i = 0; i<str.length; i++){
            if(A.contains(str[i])){ // 입력한 문자열이 배열에 있는지 검사
                A = A.replace(str[i], "#"); // str[i]는 하나의 갯수로 표시해얌으로 #으로 변환
            }
        }
        System.out.println(A.length());
        scan.close();
    }
}
