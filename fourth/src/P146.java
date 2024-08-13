import java.util.HashMap;
import java.util.Map;

/**
 * @author: xuzhi
 * @date: 2024/8/11 17:08
 * @description:
 */

public class P146 {
    class LRUCache {

        class Node{
            Node next;
            Node pre;
            int val;
            int key;

            public Node(int key,int val){
                this.val = val;
                this.key = key;
            }
            public Node(){}
        }

        int cap;

        Node head;
        Node tail;

        Map<Integer,Node> map = new HashMap<>();


        public LRUCache(int capacity) {
            this.cap = capacity;
            head = new Node();
            tail = new Node();
            head.pre = tail;
            head.next = tail;
            tail.next = head;
            tail.pre = head;
        }

        public int get(int key) {
            if(!map.containsKey(key)){
                return -1;
            }
            else {
                int ans = map.get(key).val;
                deleteNode(key);
                addToHead(key,ans);
                return ans;
            }
        }

        public void put(int key, int value) {
            if(map.containsKey(key)){
                // 更新值
                deleteNode(key);
                addToHead(key, value);
            }
            else {
                // cap足够
                if(map.size() < cap){
                    addToHead(key, value);
                }
                // cap不够
                else {
                    deleteNode(tail.pre.key);       // 删除尾部节点
                    addToHead(key,value);           // 加入头部节点
                }
            }
        }

        // 删除节点
        public void deleteNode(int key){
            Node node = map.get(key);

            node.pre.next = node.next;
            node.next.pre = node.pre;
            map.remove(key);
        }

        // 添加到头节点
        public void addToHead(int key,int val){
            Node node = new Node(key,val);
            node.next = head.next;
            head.next.pre = node;
            head.next = node;
            node.pre = head;
            map.put(key,node);
        }
    }


}
