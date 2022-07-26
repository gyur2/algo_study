package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BOJ2018 {
    static int avg(int[] arr){
        double sum = 0;
        for (int x : arr){
            sum += x;
        }
        sum = Math.round(sum / arr.length);
        return (int) Math.ceil(sum);
    }
    static int middle(int[] arr){
        return arr[(arr.length/2)];
    }
    static int range(int[] arr){
        return arr[arr.length-1] - arr[0];
    }
    static int mode(int[] arr){
        int cnt[] = new int[8001];
        ArrayList<Integer> arrayList = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int x : arr){
            if (x < 0){
                cnt[Math.abs(x)+4000]++;
            } else {
                cnt [x]++;
            }
        }
        int index = 0;
        for (int i = 0; i < cnt.length; i++) {
            if (cnt[i] != 0 && cnt[i] > max){
                max = cnt[i];
                index = i;
            }
        }
        for (int i = 0; i < cnt.length; i++) {
            int x = i;
            if (cnt[i] == max){
                if (i > 4000){
                    x -= 4000;
                    x *= -1;
                    arrayList.add(x);
                } else {
                    arrayList.add(i);
                }
            }
        }
        Collections.sort(arrayList);
        if (arrayList.size() > 1) {
            return arrayList.get(1);
        } else {
            return arrayList.get(0);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        System.out.println(avg(arr));
        System.out.println(middle(arr));
        System.out.println(mode(arr));
        System.out.println(range(arr));
    }
}
