import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class BOJ3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> hs = new HashSet<Integer>();

        for(int i = 0; i < 10; i++){
            hs.add(Integer.parseInt(br.readLine()) % 42); 
            // 입력받은 값의 나머지 값 add를 통해 hs저장
            // HashSet은 저번에 설명 했던거와 같이 중복값일 경우 하나만 저장
        }
        System.out.println(hs.size()); // 값 출력
    }
}

// 10
