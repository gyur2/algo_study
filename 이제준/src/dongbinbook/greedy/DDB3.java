package dongbinbook.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DDB3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int result = 0;

        while (true){
            int target = (n / k) * k;
            System.out.println(target);
            result += (n - target);
            System.out.println(result);

            n = target;
            System.out.println(n);
            if (n < k) break;

            result += 1;
            n /= k;
        }
        result += (n - 1);
        System.out.println(result);
    }
}
