import java.util.*;

public class BOJ1181 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashSet<String> hs = new HashSet<>(); // 중복제거를 위한 hashset
        int n = scan.nextInt(); // 단어 총 입력할 갯수

        for (int i=0; i<n; i++){ // 갯수만큼 단어 입력
            hs.add(scan.next());
        }

        hs.stream().sorted() // hs변수 스트림 후 sorted를 통해 문자열 길이 정령
                .sorted(Comparator.comparingInt(String::length))
                .forEach(System.out::println); // 정렬 후 forEach로 출력
    }

}
