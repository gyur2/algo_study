import java.util.Scanner;

public class BOJ2884 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int ho = scan.nextInt(); // 시간
        int mi = scan.nextInt(); // 분
        scan.close();

        if(mi >= 45){ // 분이 45 이상이면 45를 빼줘도 시간에는 변동이 없어서 바로 출력
            System.out.println(ho + " " + (mi - 45));
        }else { //
            if(ho == 0){
                ho = 24;
            }
            System.out.println(ho - 1 + " " + (mi + 15)); //
        }
    }
}
