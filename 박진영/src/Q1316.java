import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q1316 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(bufferedReader.readLine());
        String[] strArr = new String[N];
        for (int i = 0; i < N; i++) {
            strArr[i] = bufferedReader.readLine();
        }

        int answer = 0;
        Map<Character, List<Integer>> map = new HashMap<>();
        for (String str : strArr) {
            char[] charArr = str.toCharArray();
            for (int i = 0; i < charArr.length; i++) {
                List<Integer> list = map.getOrDefault(charArr[i], new ArrayList<>());
                list.add(i);
                map.put(charArr[i], list);
            }

            if (isAllSequential(map)) {
                answer++;
            }
            map.clear();
        }

        bufferedWriter.write(answer + "\n");
        bufferedWriter.flush();
    }

    private static boolean isAllSequential(Map<Character, List<Integer>> map) {
        for (List<Integer> list : map.values()) {
            if (!isSequential(list)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isSequential(List<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i + 1) - list.get(i) != 1) {
                return false;
            }
        }
        return true;
    }

}
