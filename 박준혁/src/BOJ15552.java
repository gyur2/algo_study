import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ15552 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in)); // 입력
        BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out)); // 출력

        int size = Integer.parseInt(br.readLine()); // 예외처리 안하면 오류뜸..

        StringTokenizer st;

        for(int i = 0; i<size; i++){
            st = new StringTokenizer(br.readLine(), " ");  // 공백으로 문자열 구분

            // StringTokenizer 분리된 문자열을 받아 nextToken -> 정수로 변환
            bw.write(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + "\n");
        }
        bw.flush(); // 데이터 출력

        bw.close();
    }
}
// 20분