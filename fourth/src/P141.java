/**
 * @author: xuzhi
 * @date: 2024/8/10 18:57
 * @description:
 */

public class P141 {
    public boolean hasCycle(ListNode head) {
        if(head == null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;


        while(fast != null && fast.next != null && fast != slow){
            slow = slow.next;
            fast = fast.next.next;
        }
        return fast == slow;
    }
}
