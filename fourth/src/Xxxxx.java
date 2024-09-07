import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author sprite-pc
 * @description:
 * @date 2024/8/17 10:27
 */
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
//    }
    static ThreadLocal threadLocal = new ThreadLocal();

    public static void main(String[] args) {
        threadLocal.set("a");
    }

}
