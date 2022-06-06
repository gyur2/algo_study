import java.util.Scanner;

public class BOJ1546 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt(); // 시험 과목 갯수
        // 정수가 아닌 실수형이라 int 가 아닌 double 사용
        double score[] = new double[num];
        double max = 0;

        for(int i = 0; i < num; i++){
            score[i] = scan.nextInt();
            max = Math.max(max, score[i]); // 과목점수에서 최고점수 찾기
        }

        for(int i = 0; i < num; i++){
            score[i] = score[i] / max * 100; // 과목 / 최고점수 * 100
        }

        double avg = 0, total = 0;
        for(int i = 0; i < num; i++){
            total += score[i]; // 연산한 점수들의 총 합
        }
        avg = total / num;
        System.out.println(avg);
    }
}

// 35