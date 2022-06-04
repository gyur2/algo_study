import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = 0;
        int index = 0;
        int[] array = new int[9];

        for(int i = 0; i < array.length; i++){
            array[i] = Integer.parseInt(br.readLine());
            if(max < array[i]){
                max = array[i];
                index = i + 1;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}
// 15