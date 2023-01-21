package 김세호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1268 {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(sc.readLine());

        int arr[][] = new int[n][5];
        int cntArr[] = new int[n];
        boolean isSame[] = new boolean[n];

        for(int i=0; i<n; i++) {
            cntArr[i] = 0;
            isSame[i] = false;
        }

        
        for(int i=0; i<n; i++){
            st = new StringTokenizer(sc.readLine(), " ");
            for(int j=0; j<5; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<5; j++){
                for(int k=0; k<n; k++){
                    if(i == k) continue;
                    
                    if(arr[i][j] == arr[k][j] && isSame[k] == false) {
                        isSame[k] = true;
                        cntArr[i]++;
                    }
                }
            }
            for(int j=0; j<n; j++) isSame[j] = false;
        }

        int max = cntArr[0];
        for(int i=1; i<n; i++) if (cntArr[i] > max) max = cntArr[i];

        for(int i=0; i<n; i++) {
            if(cntArr[i] == max) {
                System.out.println(i+1);
                break;
            }
        }
    }
}