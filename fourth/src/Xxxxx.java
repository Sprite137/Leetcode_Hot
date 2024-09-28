import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author sprite-pc
 * @description:
 * @date 2024/8/17 10:27
 */

import java.util.*;

public class Xxxxx {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//        int n = in.nextInt();
//        int m = in.nextInt();
//        String sn = in.next();
//        String sm = in.next();
//
//        int nStart = -1;
//        int mStart = -1;
//        for (int i = 0; i < m; i++) {
//            boolean flag = true;
//            for (int j = 0; j < n ; j++) {
//                if(i +j >=m){
//                    continue;
//                }
//                if (sn.charAt(j) + sm.charAt(i + j) -96 > 3) {
//                    flag = false;
//                    break;
//                }
//
//            }
//            if (flag) {
//                nStart = i;
//                break;
//            }
//
//        }
//        for (int i = 0; i < n; i++) {
//            boolean flag = true;
//            for (int j = 0; j < m ; j++) {
//                if(i +j >=n){
//                    continue;
//                }
//                if (sn.charAt(i+j) + sm.charAt(j) -96 > 3) {
//                    flag = false;
//                    break;
//                }
//
//            }
//            if (flag) {
//                mStart = i;
//                break;
//            }
//
//        }
//        if(mStart == -1 && nStart == -1){
//            System.out.println(n+m);
//            return;
//        }
//
//        if(nStart != -1 && mStart!= -1){
//            System.out.println(Math.min(Math.max(m+mStart,n),Math.max(n+nStart,m)));
//            return;
//        }
//        if(mStart != -1){       // mStart
//            System.out.println(Math.max(m+mStart,n));
//            return;
//        }
//        System.out.println(Math.max(n+nStart,m));      // nStart
//        return;
//
//    }
//class Node{
//    int key;
//    int value;
//    Node prev;
//    Node next;
//
//    Node(){};
//    Node(int key, int value){
//        this.key = key;
//        this.value = value;
//    };
//}
//
//    int capacity;
//    Node head;
//    Node tail;
//    Map<Integer,Node> map = new HashMap<>();
//
//    public LRUCache(int capacity) {
//        this.capacity = capacity;
//        head.next = tail;
//        head.prev = tail;
//        tail.next = head;
//        tail.prev = head;
//    }
//
//    public int get(int key) {
//        if(map.containsKey(key)){
//            Node node = map.get(key);
//            // delete Node
//
//            // add Node
//
//            return node.value;
//        }else{
//            return -1;
//        }
//    }
//
//    public void put(int key, int value) {
//        if(map.containsKey(key)){
//            Node node = map.get(key);
//            node.value = value;
//            // delete Node
//            delete(node);
//
//            // add Node
//            add(node);
//        }
//        else{
//            if(map.size() <capacity){
//                Node node = new Node(key,value);
//                // add Node
//                add(node);
//            }
//            else{
//                // delete tail.prev;
//                delete(taol.prev);
//
//                Node node = new Node(key,value);
//                // add Node
//                add(node);
//            }
//        }
//    }
//
//    public void delete(Node node){
//        // Node temp = node.next;
//        node.next.prev = node.prev;
//        node.prev.next = node.next;
//    }
//
//    public void add(Node node){
//        node.next = head.next;
//        head.next.prev = node;
//        head.next = node;
//        node.prev = head;
//
//

//    static int ans = 0;
//    static  int index = 1;
//    static List<String> ans = new ArrayList<>();
//    public static void main(String[] args) {
//        String s = "012345678";
//        dfs(s,0,0,100,new StringBuilder(""));
//        System.err.println(ans);
//    }
//
//    public static void dfs(String s, int index, int length, int target ,StringBuilder base){
//        if(index == s.length()){
//            int sum = getVal(base.toString());
//            if(sum == target){
//                ans.add(base.toString());
//            }
//        }
//        else {
//            // +
//            if(index !=0){
//                base.append("+");
//                base.append(s.charAt(index));
//                dfs(s,index+1,length,target,base);
//                base.deleteCharAt(base.length()-1);
//                base.deleteCharAt(base.length()-1);
//            }
//
//
//            // -
//            base.append("-");
//            base.append(s.charAt(index));
//            dfs(s,index+1,length,target,base);
//            base.deleteCharAt(base.length()-1);
//            base.deleteCharAt(base.length()-1);
//
//            // 不变
//            base.append(s.charAt(index));
//            dfs(s,index+1,length,target,base);
//            base.deleteCharAt(base.length()-1);
//        }
//    }
//
//    public static int getVal(String s){
//        Stack<Character> stack = new Stack<>();
//        for(int i = 0;i<s.length();i++){
//            stack.add(s.charAt(i));
//        }
//        List<String> list = new ArrayList<>();
//        StringBuilder temp = new StringBuilder();
//        while(!stack.isEmpty()){
//            char ch = stack.pop();
//            if(ch =='-'){
//                temp.reverse();
//                temp.append(ch);
//                list.add(temp.reverse().toString());
//                temp = new StringBuilder();
//            } else if (ch =='+') {
//                list.add(temp.reverse().toString());
//                temp = new StringBuilder();
//            }
//            else {
//                temp.append(ch);
//            }
//
//        }
//        int ans = 0;
//        for(String a:list){
//            ans += Integer.parseInt(a);
//        }
//        return ans;
//        TreeNode root = new TreeNode(5);
//        root.left = new TreeNode(2);
//        root.right = new TreeNode(10);
//        root.left.left = new TreeNode(1);
//
//        dfs(root,4);
//        System.err.println(ans);
//    }
//
//    public  static void dfs(TreeNode node,int k){
//        if(node != null){
//            dfs(node.right,k);
//            if(index >=k){
//                if(index >k){
//                    return;
//                }
//                ans = node.val;
//                index++;
//                return;
//            }
//            index++;
//            dfs(node.left,k);
//        }
//    }

    public static void main(String[] args) {
//        HashMap<Integer,Integer> map = new HashMap<>();
//        map.put(1,1);
//        map.put(1,2);
//        System.err.println(map.get(1));
//        System.err.println(1);
        Date date1 =  new Date();
        System.err.println(date1.toString());
        java.sql.Date date2 = new java.sql.Date(date1.getTime());
        System.err.println(date2.toString());
    }


}
