import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // br이 받은 문자열을 공백으로 나눔
        StringTokenizer to = new StringTokenizer(br.readLine(), " ");

        int count = to.countTokens(); // 토큰의 갯수 -> count 대입

        System.out.println(count);
        br.close();
    }
}
