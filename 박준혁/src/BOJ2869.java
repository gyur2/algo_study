import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken()); // 낮에 올라가는 높이
        int B = Integer.parseInt(st.nextToken()); // 밤에 미끄러지는 높이
        int V = Integer.parseInt(st.nextToken()); // 정상 높이

        int day = (V - B) / (A - B); // 총 걸리는 시간
        if((V - B) % (A - B) != 0){  // 나머지가 0이 아닐경우 하루 추가
            day++;
        }
        System.out.println(day);
        br.close();
    }
}
