import java.util.Scanner;

public class BOJ4344 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt(); // 테스트 케이스 갯수
        int stu, total, cnt;
        int array[] = new int[1000]; // 최대 1000명의 학생

        double avg;
        for(int i = 0; i < size; i++){     // 테스트 케이스만큼 반복문
            stu = scan.nextInt();
            total = 0;
            cnt = 0;
            for(int j = 0; j < stu; j++){
                array[j] = scan.nextInt(); // 학생점수 입력
                total += array[j];         // 학생점수 합
            }

            avg = total/stu;               // 학생점수 평균
            for(int j = 0; j < stu; j++){
                if(avg < array[j]){        // 평균이 넘는 학생 수 cnt 변수 증가
                    cnt++;
                }
            }
            // double 형으로 변환 소수 3번째까지 표현이므로 실수형 포멧형식
            System.out.printf("%.3f%%\n", (double)cnt/stu*100);
        }
    }
}
// 35