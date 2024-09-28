import java.util.HashMap;
import java.util.Map;

/**
 * @author: xuzhi
 * @date: 2024/8/11 17:08
 * @description:
 */

public class P146 {
//    class LRUCache {
//
//        class Node{
//            Node next;
//            Node pre;
//            int val;
//            int key;
//
//            public Node(int key,int val){
//                this.val = val;
//                this.key = key;
//            }
//            public Node(){}
//        }
//
//        int cap;
//
//        Node head;
//        Node tail;
//
//        Map<Integer,Node> map = new HashMap<>();
//
//
//        public LRUCache(int capacity) {
//            this.cap = capacity;
//            head = new Node();
//            tail = new Node();
//            head.pre = tail;
//            head.next = tail;
//            tail.next = head;
//            tail.pre = head;
//        }
//
//        public int get(int key) {
//            if(!map.containsKey(key)){
//                return -1;
//            }
//            else {
//                int ans = map.get(key).val;
//                deleteNode(key);
//                addToHead(key,ans);
//                return ans;
//            }
//        }
//
//        public void put(int key, int value) {
//            if(map.containsKey(key)){
//                // 更新值
//                deleteNode(key);
//                addToHead(key, value);
//            }
//            else {
//                // cap足够
//                if(map.size() < cap){
//                    addToHead(key, value);
//                }
//                // cap不够
//                else {
//                    deleteNode(tail.pre.key);       // 删除尾部节点
//                    addToHead(key,value);           // 加入头部节点
//                }
//            }
//        }
//
//        // 删除节点
//        public void deleteNode(int key){
//            Node node = map.get(key);
//
//            node.pre.next = node.next;
//            node.next.pre = node.pre;
//            map.remove(key);
//        }
//
//        // 添加到头节点
//        public void addToHead(int key,int val){
//            Node node = new Node(key,val);
//            node.next = head.next;
//            head.next.pre = node;
//            head.next = node;
//            node.pre = head;
//            map.put(key,node);
//        }
//    }
static class LRUCache {
    static class ListNode{
        int key;
        int val;
        ListNode pre;
        ListNode next;

        ListNode(int key, int val){
            this.key = key;
            this.val = val;
        };

        ListNode(){};
    }

    int capacity;
    Map<Integer,ListNode> map = new HashMap<>();
    ListNode head = new ListNode();
    ListNode tail = new ListNode();


    public LRUCache(int capacity) {
        this.capacity = capacity;
        head.next = tail;
        head.pre = tail;
        tail.next = head;
        tail.pre = head;
    }

    public int get(int key) {
        if(map.containsKey(key)){
            ListNode node = map.get(key);
            deleteNode(node);
            addNode(node);
            return node.val;
        }
        else{
            return -1;
        }

    }

    public void put(int key, int value) {
        if(map.containsKey(key)){
            ListNode node = map.get(key);
            deleteNode(node);
            node.val = value;
            addNode(node);
        }
        else{
            if(map.size() < capacity){
                ListNode node = new ListNode(key, value);
                addNode(node);
                map.put(key,node);
            }
            else{
                ListNode temp = map.get(tail.pre.key);

                map.remove(tail.pre.key);
                deleteNode(temp);

                ListNode node = new ListNode(key, value);
                addNode(node);
                map.put(key,node);
            }
        }
    }

    public void deleteNode(ListNode node){
        node.pre.next = node.next;
        node.next.pre = node.pre;
    }

    public void addNode(ListNode node){
        head.next.pre = node;
        node.next = head.next;
        head.next = node;
        node.pre = head;
    }

    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(2);
        lruCache.put(1,1);
        lruCache.put(2,2);
        System.err.println(lruCache.get(1));
        lruCache.put(3,3);
        System.err.println(lruCache.get(2));
        lruCache.put(4,4);
    }
}


}
