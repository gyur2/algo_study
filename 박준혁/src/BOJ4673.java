public class BOJ4673 {
    public static void main(String[] args) {
        boolean[] boo = new boolean[10001]; // 10000까지의 숫자라 10001

        for (int i = 1; i <= 10000; ++i) { // 10000보다 큰 숫자 제거
            int k = d(i);                  // 함수 d k에 대입
            if (k <= 10000) {              // 10000이하의 숫자만 셀프넘버인지 판단
                boo[k] = true;
            }
        }

        for (int i = 1; i < boo.length; ++i) { // boo[i]의 값이 false 혹은 0일때 괄호안에 코드가 실행
            if (!boo[i]) {
                System.out.println(i);
            }
        }
    }

    private static int d(int m) { // 함수 선언
        int c = m;
        while(m > 0) {
            c += m % 10;    // 변수 m를 10으로 나눈 값을 변수 c에 저장된 값에 더하고 그 값을 변수 c에 저장
            m /= 10;        // 변수 m를 10으로 나눈다.
        }
        return c;
    }
}
// 47