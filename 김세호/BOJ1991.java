// 트리

// 10:15
// 11:15

package 김세호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Node{
    String key;
    Node left;
    Node right;

    Node() {key = null; left = null; right = null;}
    Node(String key) {this.key = key; this.left = null; this.right = null;}
    Node(String key, Node left, Node right) {this.key = key; this.left = left; this.right = right;}
}

public class BOJ1991 {
    static void insertBT(Node t, String root, String leftKey, String rightKey){
        if(t.key.equals(root)){
            if(!leftKey.equals(".")) {
                t.left = new Node(leftKey);
            }
            if(!rightKey.equals(".")){
                t.right = new Node(rightKey);
            }
        } else {
            if(t.left != null){
                insertBT(t.left, root, leftKey, rightKey);
            }
            if(t.right != null){
                insertBT(t.right, root, leftKey, rightKey);
            }
        }
    }

    static void PreOrder(Node t){
        if(t == null){return;}
        System.out.print(t.key);
        PreOrder(t.left);
		PreOrder(t.right);
    }
    static void InOredr(Node t){
        if(t == null){return;}
        InOredr(t.left);
        System.out.print(t.key);
		InOredr(t.right);
    }
    static void PostOrder(Node t){
        if(t == null){return;}
        PostOrder(t.left);
		PostOrder(t.right);
        System.out.print(t.key);

    }
    static Node newTree = new Node("A");
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        
      
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());

            String root = st.nextToken();
            String left = st.nextToken();
            String right = st.nextToken();
            insertBT(newTree, root, left, right);
        }
        PreOrder(newTree);
        System.out.println();
        InOredr(newTree);
        System.out.println();
        PostOrder(newTree);
    }
}