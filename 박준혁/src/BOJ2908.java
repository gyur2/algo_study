import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringBuilder sb = new StringBuilder(str); // sb에 입력한 문자열 저장
        sb.reverse(); // 입력한 문자열을 reverse() 를 통해 뒤집기

        // StringTokenizer 의 생성자 인자로 String 형을 받기 때문에 (sb.toString(), " ") 사용
        StringTokenizer to = new StringTokenizer(sb.toString(), " ");
        int a = Integer.parseInt(to.nextToken()); // 형 변환
        int b = Integer.parseInt(to.nextToken());

        System.out.println(Math.max(a, b));
        br.close();
    }
}
