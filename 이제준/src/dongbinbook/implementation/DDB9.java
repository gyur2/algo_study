package dongbinbook.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class DDB9 {
    public static ArrayList<Character> list = new ArrayList<>();
    public static int value = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))){
                list.add(str.charAt(i));
            } else {
                value += Character.getNumericValue(str.charAt(i));
            }
        }
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
        if (value != 0){
            System.out.print(value);
        }
        System.out.println();
    }
}
