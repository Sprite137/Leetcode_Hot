import java.util.HashMap;
import java.util.LinkedHashMap;

public class P146 {
    static class LRUCache {

        static class Node{
            int key;

            int value;

            Node prev;

            Node next;

            public Node(int key, int value) {
                this.key  = key;
                this.value = value;
            }
        }

        int capacity;

        Node head;

        Node tail;

        HashMap<Integer,Node> map = new LinkedHashMap<>();

        public LRUCache(int capacity) {
            this.capacity = capacity;
            head = new Node(-1,-1);
            tail = new Node(-1,-1);
            head.next =tail;
            tail.prev = head;
        }

        public int get(int key) {
            if(!map.containsKey(key)){
                return -1;
            }
            Node node = map.get(key);

            // 放到最前面
            deleteNode(node);
            insertToHead(node);

            return node.value;
        }

        public void put(int key, int value) {
            if(map.containsKey(key)){
                Node node = map.get(key);
                node.value  = value;
                // 拿到并放到最前面
                deleteNode(node);
                insertToHead(node);
                map.put(key,node);
            }
            else {
                // 放到最前面
                Node node = new Node(key,value);
                map.put(key,node);
                insertToHead(node);


                if(map.size() > capacity){
                    // 删除最后的
                    int deleteKey = tail.prev.key;
                    deleteNode(tail.prev);
                    map.remove(deleteKey);


                }

            }

        }

        public void deleteNode(Node node){
            node.prev.next = node.next;
            node.next.prev = node.prev;
        }

        public void insertToHead(Node node){
            Node next = head.next;
            head.next = node;
            node.prev = head;
            node.next = next;
            next.prev = node;
        }
    }

    public static void main(String[] args) {
        LRUCache LRU = new LRUCache(2);
        LRU.put(1,1);
        LRU.put(2,2);
        LRU.get(1);
        LRU.put(3,3);
        LRU.get(3);
    }
}
