public class P24 {
//    public ListNode swapPairs(ListNode head) {
//        ListNode dummy = new ListNode();
//        dummy.next = head;
//        ListNode pre = dummy;
//        ListNode cur = pre.next;
//        if(cur == null){
//            return head;
//        }
//        ListNode l2 = cur.next;
//        if(l2 == null){
//            return head;
//        }
//        while(true){
//            ListNode next = l2.next;
//            l2.next = cur;
//            cur.next = next;
//            pre.next = l2;
//
//            pre =cur;
//            cur = pre.next;
//            if(cur == null){
//                break;
//            }
//            l2 = cur.next;
//            if(l2 == null){
//                break;
//            }
//        }
//        return dummy.next;
//    }
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode pre = dummy;
        ListNode cur = pre.next;
        if(cur == null){
            return head;
        }
        ListNode l2 = cur.next;
        if(l2 == null){
            return head;
        }

        while(true){
            ListNode temp = l2.next;
            cur.next = temp;
            l2.next = cur;
            pre.next = l2;

            pre = cur;
            cur = temp;
            if(cur == null){
                return dummy.next;
            }
            l2 = cur.next;
            if(l2 == null){
                return dummy.next;
            }
        }
//        return dummy.next;
    }
}
