public class P142 {
//    public ListNode detectCycle(ListNode head) {
//        if(head == null){
//            return null;
//        }
//        ListNode fast = head.next;
//        ListNode slow = head;
//        while(fast != null && fast.next != null ){
//            if(fast == slow){
//                break;
//            }
//            fast = fast.next.next;
//            slow = slow.next;
//        }
//        if(fast == null || fast.next == null){
//            return null;
//        }
//        slow = head;
//        while(slow != fast ){
//            fast = fast.next.next;
//            slow = slow.next;
//        }
//        return slow;
//    }
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }
        ListNode fast = head.next;
        ListNode slow = head;
        while(slow != fast){
            if(fast == null || fast.next == null){
                return null;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        slow = head;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;

    }
}
