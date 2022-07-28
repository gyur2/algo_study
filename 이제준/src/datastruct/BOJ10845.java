package datastruct;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Queue<Integer> queue = new LinkedList<>();
        int backNum = 0;

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String command = st.nextToken();
            switch (command){
                case "push":
                    int num = Integer.parseInt(st.nextToken());
                    queue.add(num);
                    backNum = num;
                    break;
                case "pop":
                    if (queue.isEmpty()){
                        sb.append("-1\n");
                    } else {
                        sb.append(queue.poll()).append('\n');
                    }
                    break;
                case "size":
                    sb.append(queue.size()).append('\n');
                    break;
                case "empty":
                    if (queue.isEmpty()){
                        sb.append("1\n");
                    } else {
                        sb.append("0\n");
                    }
                    break;
                case "front":
                    if (queue.isEmpty()){
                        sb.append("-1\n");
                    } else {
                        sb.append(queue.peek()).append('\n');
                    }
                    break;
                case "back":
                    if (queue.isEmpty()){
                        sb.append("-1\n");
                    } else {
                        sb.append(backNum).append('\n');
                    }
                    break;
            }
        }
        System.out.println(sb);
    }
}
