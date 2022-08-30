package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ22858 {
    static int n,m;
    static int [] changes;
    static int [] arr;
    static int [] temp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n+1];
        changes = new int[n+1];

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i=1; i<=n; i++){
            arr[i] = Integer.parseInt(st2.nextToken());
        }

        StringTokenizer st3 = new StringTokenizer(br.readLine());
        for(int i=1; i<=n; i++){
            changes[i] = Integer.parseInt(st3.nextToken());
        }

        for(int i=0; i<m; i++){
            temp = new int[n+1];
            for(int j=1; j<=n; j++){
                temp[changes[j]] = arr[j];
            }
            arr = temp;
        }

        for(int i=1; i<=n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
