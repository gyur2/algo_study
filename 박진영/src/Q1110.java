import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1110 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(bufferedReader.readLine());
        int temp = N;

        if (N < 10) {
            temp = sumOfDigit(N * 10);
        }

        int answer = 0;
        do {
            temp = temp % 10 * 10 + sumOfDigit(temp) % 10;
            answer++;
        } while (temp != N);

        bufferedWriter.write(answer + "\n");
        bufferedWriter.flush();
    }

    private static int sumOfDigit(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}