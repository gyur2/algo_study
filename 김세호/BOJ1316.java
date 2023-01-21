// 17:20
// 16:10
package 김세호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1316 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String arr[] = new String[n];

        for(int i=0; i<n; i++){
            arr[i] = br.readLine();
        }

        int cnt = 0;

        for(String s : arr){
            boolean isGroup = true;
            for(int i=0; i<s.length()-1; i++){
                boolean isSame = false;
                for(int j=i+1; j<s.length(); j++){
                    if(s.charAt(i) == s.charAt(j)){
                        if(j-i == 1){
                            isSame = true;
                        }
                        else {
                            isGroup = false;
                            break;
                        }
                    }
                    if (isSame == true) break;
                }
                if(isGroup == false) break;
            }
            if (isGroup == true) cnt++;
        }
        System.out.print(cnt);
    }
}