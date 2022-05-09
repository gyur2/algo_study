import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Q2108 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(bufferedReader.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(bufferedReader.readLine());
        }
        Arrays.sort(arr);

        int arithmeticMean = calculateArithmeticMean(arr, N);
        int median = calculateMedian(arr, N);
        int mode = calculateMode(arr);
        int range = calculateRange(arr, N);

        bufferedWriter.write(arithmeticMean + "\n");
        bufferedWriter.write(median + "\n");
        bufferedWriter.write(mode + "\n");
        bufferedWriter.write(range + "\n");
        bufferedWriter.flush();
    }

    private static int calculateArithmeticMean(int[] arr, int N) {
        return (int) Math.round(Arrays.stream(arr).sum() / (double) N);
    }

    private static int calculateMedian(int[] arr, int N) {
        if (N % 2 == 0) {
            return (arr[N / 2] + arr[N + 1]) / 2;
        }
        return arr[N / 2];
    }

    private static int calculateMode(int[] arr) {
        Map<Integer, Integer> map = new LinkedHashMap<>();

        int maxCount = Integer.MIN_VALUE;
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            maxCount = Math.max(maxCount, map.get(num));
        }

        List<Integer> result = new ArrayList<>();
        for (Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxCount) {
                result.add(entry.getKey());
            }
        }

        if (result.size() == 1) {
            return result.get(0);
        }
        return result.get(1);
    }

    private static int calculateRange(int[] arr, int N) {
        return arr[N - 1] - arr[0];
    }

}
