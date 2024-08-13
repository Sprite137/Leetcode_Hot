import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/**
 * @author: xuzhi
 * @date: 2024/8/11 16:17
 * @description:
 */

public class P25 {
    public static ListNode reverseKGroup(ListNode head, int k) {
        Deque<ListNode> deque = new LinkedList<>();
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode cur = head, pre = dummy;
        while(true){
            while(deque.size() < k && cur != null){
                deque.addLast(new ListNode(cur.val));
                cur = cur.next;
            }
            if(deque.size() < k){
                while(!deque.isEmpty()){
                    pre.next = deque.pollFirst();
                    pre = pre.next;
                }
                return dummy.next;
            }
            while(!deque.isEmpty()){
                pre.next = deque.pollLast();
                pre = pre.next;
            }

        }
    }

    public static void main(String[] args) {
        ListNode a = new ListNode();
        a.create(a,new int[]{1,2,3,4,5});
        a.show(reverseKGroup(a,3));
    }
}
