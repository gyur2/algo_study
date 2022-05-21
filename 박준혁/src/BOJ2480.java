import java.util.Scanner;

public class BOJ2480 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int dice1 = scan.nextInt();
        int dice2 = scan.nextInt();
        int dice3 = scan.nextInt();
        scan.close();

        int sum;

        if(dice1 == dice2 && dice1 == dice3 && dice2 == dice3){
            sum = 10000 + dice1 * 1000;
        }else if(dice1 == dice2 || dice1 == dice3){
            sum = 1000 + dice1 * 100;
        }else if(dice2 == dice3){
            sum = 1000 + dice2 * 100;
        }else{
            sum = Math.max(dice1 , Math.max(dice2, dice3)) * 100;
        }
        System.out.println(sum);
    }
}
// 12분