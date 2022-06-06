import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] array = new int[size];

        for(int i = 0; i < size; i++){
            array[i] = Integer.parseInt(st.nextToken());
        }

        int num1 = array[0];
        int num2 = array[0];

        for(int i = 1; i < size; i++){
            if(num1 > array[i]){
                num1 = array[i];
            }
            if(num2 < array[i]){
                num2 = array[i];
            }
        }
        System.out.print(num1 + " " + num2);
    }
}
// 30