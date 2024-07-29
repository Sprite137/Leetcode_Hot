public class P141 {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast!=null && fast.next!=null && slow!=fast){
            fast = fast.next.next;
            slow =slow.next;
        }
        if(slow==fast){
            return true;
        }else {
            return false;
        }
    }
}
