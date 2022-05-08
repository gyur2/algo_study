import java.util.*;

public class BOJ1110 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int ran = scan.nextInt();
        scan.close();
		int number = ran;
		int cnt = 0;
		
		while(true) {
			int a = number / 10;
			int b = number % 10;
			number = b * 10 + (a + b) % 10;
			cnt++;
			if(ran == number) {
				break;
			}
		}
		System.out.println(cnt);
	}
}
