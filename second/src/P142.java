public class P142 {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast && fast != null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        if(slow!=fast){
            return null;
        }
        fast = head;
        while(slow.next != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return fast;
    }
}
