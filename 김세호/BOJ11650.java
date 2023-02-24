// 18:10
// 18:25

// 자바의 대표적인 2차원 배열 정렬 오버라이딩

package 김세호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ11650 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());

        int arr[][] = new int[n][2];
        
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<2; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        Arrays.sort(arr, new Comparator<int[]>(){
            @Override
                public int compare(int[] o1, int[] o2){
                    if(o1[0] == o2[0]){ // 0번째가 같을때
                        return o1[1] - o2[1]; // 1번째를 기준으로 정렬
                    } else{
                        return o1[0] - o2[0]; // 0번째가 다르면 0번째를 기준으로 정렬
                    }
                }
        });

        System.out.println();

        for(int i=0; i<n; i++){
            for(int j=0; j<2; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}