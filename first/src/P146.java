import javax.swing.event.ListDataEvent;
import java.util.HashMap;

public class P146 {


    class LRUCache {
        class DListNode{
            int key;
            int value;

            DListNode next;

            DListNode prev;

            DListNode(int k, int v){
                this.key = k;
                this.value  =v;
            }
        }
        private int capacity;

        private DListNode head;

        private DListNode tail;

        private HashMap<Integer,DListNode> map;


        public LRUCache(int capacity) {
            map = new HashMap<>();
            this.capacity = capacity;
            head = new DListNode(-1,-1);
            tail = new DListNode(-1,-1);
            head.next = tail;
            tail.prev = head;

        }

        public int get(int key) {
            DListNode node = map.get(key);
            if(node!=null){
                moveToTail(key,node.value);
                return node.value;
            }
            return -1;

        }


        private void moveToTail(int key,int value) {
            deleteNode(map.get(key));
            DListNode node = new DListNode(key,value);
            insertToTail(node);
        }

        private void deleteNode(DListNode dListNode) {

            dListNode.prev.next = dListNode.next;
            dListNode.next.prev = dListNode.prev;
        }


        public void put(int key, int value) {
            if(map.containsKey(key)){
                moveToTail(key,value);
            }
            else {
                DListNode dListNode = new DListNode(key,value);
                if(map.size()==capacity){
                    DListNode toBeDelete = head.next;
                    deleteNode(toBeDelete);
                    map.remove(toBeDelete.key);

                }
                insertToTail(dListNode);
                map.put(key,dListNode);
            }

        }

        private void insertToTail(DListNode dListNode) {
            tail.prev.next = dListNode;
            dListNode.prev = tail.prev;
            dListNode.next = tail;
            tail.prev = dListNode;
            map.put(dListNode.key,dListNode);
        }
    }
}
