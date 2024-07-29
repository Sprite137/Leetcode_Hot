import java.util.*;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.PriorityBlockingQueue;

public class P25 {
//    public ListNode reverseKGroup(ListNode head, int k) {
//        int index =0;
//        ListNode cur = head;
//        int length = 0;
//        while(cur!=null){
//            length++;
//            cur = cur.next;
//        }
//        cur = head;
//        while(index+k <=length){
//            cur = swap(cur,k);
//            index++;
//            cur = cur.next;
//        }
//
//        return head;
//    }
//
//    public static ListNode swap(ListNode head, int k){
//        ListNode next = null;
//        ListNode cur  = head;
//        for(int i=0;i<k;i++){
//            next = cur.next;
//            cur = cur.next;
//        }
//        cur = head;
//        ListNode prev = next;
//        for(int i=0;i<k;i++){
//            ListNode temp = cur.next;
//            cur.next = prev;
//            prev = cur;
//            cur = temp;
//        }
//        return cur;
//    }

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode pre = dummy;
        ListNode end = dummy;

        while (end.next != null) {
            for (int i = 0; i < k && end != null; i++) {
                end = end.next;
            }
            if (end == null) {
                break;
            }
            ListNode start = pre.next;
            ListNode next = end.next;
            end.next = null;
            pre.next = reverse(start);
            start.next = next;
            pre = start;

            end = pre;
        }
        return dummy.next;
    }

    private ListNode reverse(ListNode head) {
        ListNode pre = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;

    }


    public static void main(String[] args) {
        ListNode x = new ListNode();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        Object[] v = list.toArray();
        System.err.println(Arrays.toString(v));

//        int[] nums = {1,2,3,4,5};
//        int k = 3;
//        ListNode listNode = x.create(nums);
//        P25 p = new P25();
//        p.reverseKGroup(listNode,k);
    }
}
