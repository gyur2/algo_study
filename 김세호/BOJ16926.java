// 18:40
// 20:40
// 실패

// 

package 김세호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ16926 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringTokenizer st2;
        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        int arr[][] = new int[n][m];
        int shell;
        int tmp;
        int ntmp;
        boolean bre = false;

        for(int i=0; i<n; i++){
            st2 = new StringTokenizer(br.readLine());
            for(int j=0; j<m; j++){
                arr[i][j] = Integer.parseInt(st2.nextToken());
            }
        }

        if(m >= n){
            shell = n/2;
        } else {
            shell = m/2;
        }
        for(int k = 0; k<r; k++){
            for(int sh=0; sh<shell; sh++){
                bre = false;
                ntmp = arr[sh][sh];
                for(int i=sh; i<n-sh; i++){
                    tmp = ntmp;
                    for(int j=sh; j<m-sh; j++){
                        tmp = ntmp;
                        if (j == sh && i != n-sh-1){
                            ntmp = arr[i+1][j];
                            arr[i+1][j] = tmp;
                            break;
                        } else if(i == n-sh-1 && j != m-sh-1){
                            ntmp = arr[i][j+1];
                            arr[i][j+1] =  tmp;
                            continue;
                        } else if(j == n-sh-1 && i != sh){
                            ntmp = arr[i-1][j];
                            arr[i-1][j] = tmp;
                            i-=1;
                            j-=1;
                            continue;
                        } else {
                            ntmp = arr[i][j-1];
                            arr[i][j-1] = tmp;
                            j-=2;
                            if(arr[sh][sh] == tmp){
                                bre = true;
                                break;
                            }
                            continue;
                        }
                    }
                    if (bre == true) break;
                }
            }
        }
        

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
