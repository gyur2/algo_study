import java.util.Scanner;

public class BOJ5622 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine(); // 문자열입력

        int count = 0;
        int a = str.length(); // 문자열 갯수 저장

        for(int i = 0; i < a; i++) {

            switch(str.charAt(i)) {

                case 'A' : case 'B': case 'C' :
                    count += 3;
                    break;

                case 'D' : case 'E': case 'F' :
                    count += 4;
                    break;

                case 'G' : case 'H': case 'I' :
                    count += 5;
                    break;

                case 'J' : case 'K': case 'L' :
                    count += 6;
                    break;

                case 'M' : case 'N': case 'O' :
                    count += 7;
                    break;

                case 'P' : case 'Q': case 'R' : case 'S' :
                    count += 8;
                    break;

                case 'T' : case 'U': case 'V' :
                    count += 9;
                    break;

                case 'W' : case 'X': case 'Y' : case 'Z' :
                    count += 10;
                    break;
            }
        }
        System.out.print(count);
        scan.close();
    }
}
