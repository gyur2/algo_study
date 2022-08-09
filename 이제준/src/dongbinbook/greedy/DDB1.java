package dongbinbook.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class DDB1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n  = Integer.parseInt(st.nextToken());
        int m  = Integer.parseInt(st.nextToken());
        int k  = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st2.nextToken());
        }
        Arrays.sort(arr);
        int first = arr[n-1];
        int second = arr[n-2];

        int count = (m / (k+1)) * k;
        count += m % (k+1);

        int result = 0;
        result += count * first;

        result += (m - count) * second;
        System.out.println(result);
    }
}
