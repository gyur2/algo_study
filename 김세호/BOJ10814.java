// 나이순 정렬

// 20:05
// 20:50

// 자바의 대표적인 2차원 배열 정렬 오버라이딩

package 김세호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ10814 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        String arr[][] = new String[n][3];

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = st.nextToken();
            arr[i][1] = st.nextToken();
            arr[i][2] = Integer.toString(i);
        }
        
        Arrays.sort(arr, new Comparator<String[]>(){
            @Override
            public int compare(String[] o1, String[] o2){
                if(o1[0].contentEquals(o2[0])) return Integer.parseInt(o1[2]) - Integer.parseInt(o2[2]); // string을 기준으로 정렬하면 9, 10일때 10이 먼저나오기 때문에 parseint해줘야함
                else return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]); 
            }
        });

        for(int i=0; i<n; i++){
            System.out.print(arr[i][0] + " " + arr[i][1]);
            System.out.println();
        }
    }
}