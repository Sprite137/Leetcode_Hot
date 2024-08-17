

import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

public class P206 {
//    public ListNode reverseList(ListNode head) {
//        ListNode prev = null;
//        ListNode cur = head;
//        while(cur!=null){
//            ListNode next = cur.next;
//            cur.next = prev;
//            prev = cur;
//            cur = next;
//        }
//        return prev;
//    }
////    ThreadPoolExecutor

    public ListNode reverseList(ListNode head){
        ListNode cur = head;
        ListNode pre = null;
        while(cur!=null){
            ListNode next = cur.next;
            cur.next=pre;
            pre = cur;
            cur = next;

        }
        return pre;
    }
}
