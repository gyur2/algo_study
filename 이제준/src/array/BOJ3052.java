package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class BOJ3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 첫번째 풀이
        int[] arr = new int[10];
        int count = 0;
        boolean bl;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine()) % 42;
        }

        for(int j = 0; j < 10; j++){
            bl = false;
            for (int k = j+1; k < arr.length; k++) {
                if (arr[j] == arr[k]){
                    bl = true;
                    break;
                }
            }
            if (!bl){
                count++;
            }
        }
        System.out.println(count);
        // 두번째 풀이
//        HashSet<Integer> hs = new HashSet<>();
//        for (int i = 0; i < 10; i++) {
//            hs.add(Integer.parseInt(br.readLine()) % 42);
//        }
//        br.close();
//        System.out.println(hs.size());
    }
}
