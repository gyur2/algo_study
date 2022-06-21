package function;


public class BOJ4673 {
    public static void main(String[] args) {
        boolean[] arr = new boolean[10001];

        for (int i = 1; i < 10001; i++) {
            int n = check(i);

            if (n < 10001){
                arr[n] = true;
            }
        }
        for (int i = 1; i < 10001; i++) {
            if (!arr[i]){
                System.out.println(i);
            }
        }
    }
    public static int check(int n){
        int sum = n;
        while (n != 0){
            sum = sum + (n % 10);
            n = n / 10;
        }
        return sum;
    }
}
