// 22:55
// 23:20

// 2차원 배열에 넣고 0번째 인덱스를 기준으로 sorting.
// sorting된 2차원 배열에서 0번째 인덱스가 이전과 같고, 1번째 인덱스가 이전과 다르면 cnt를 증가

package 김세호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ14467 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int arr[][] = new int[n][5];
        int cnt = 0;

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<2; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });


        for(int i=1; i<n; i++){
            if(arr[i][0] == arr[i-1][0] && arr[i][1] != arr[i-1][1]) cnt++;
        }

        System.out.print(cnt);
    }
}