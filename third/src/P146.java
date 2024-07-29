import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P146 {
    class LRUCache {
        class ListNode{
            ListNode prev;
            ListNode next;
            int key;
            int value;

            public ListNode(int key, int val){
                this.key = key;
                this.value = val;
            }

            public void setValue(int value){
                this.value = value;
            }
        }
        int capacity;

        ListNode head;

        ListNode tail;

        Map<Integer,ListNode> map = new HashMap<>();

        public LRUCache(int capacity) {
            this.capacity = capacity;
            head = new ListNode(-1,-1);
            tail = new ListNode(-1,-1);
            head.prev = tail;
            head.next = tail;
            tail.prev = head;
            tail.next = head;
        }

        public int get(int key) {
            int ans = 0;
            if(map.containsKey(key)){
                ListNode node = map.get(key);
                deleteNode(node);
                moveToHead(node);
                return node.value;
            }else {
                return -1;
            }
        }

        public void put(int key, int value) {
            if(map.containsKey(key)){
                ListNode node = map.get(key);
                deleteNode(node);
                node.setValue(value);
                moveToHead(node);
            }
            else {
                if(map.size() == capacity){
                    ListNode node = new ListNode(key,value);
                    map.remove(tail.prev.key);
                    deleteNode(tail.prev);
                    moveToHead(node);
                    map.put(key,node);

                }
                else {
                    ListNode node = new ListNode(key,value);
                    moveToHead(node);
                    map.put(key,node);
                }
            }
        }

        public void deleteNode(ListNode node){
            node.prev.next = node.next;
            node.next.prev = node.prev;
        }

        public void moveToHead(ListNode node){
            node.next = head.next;
            head.next.prev = node;
            head.next = node;
            node.prev = head;
        }
    }
}
