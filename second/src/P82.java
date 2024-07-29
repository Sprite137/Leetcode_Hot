import javax.swing.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class P82 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode pre = dummy;
        while(true){
            ListNode cur = pre.next;
            if(cur == null || cur.next == null){
                break;
            }
            boolean flag = false;
            while(cur.next != null && cur.val == cur.next.val){
                cur.next = cur.next.next;
                flag = true;
            }
            if(flag){
                pre.next = cur.next;
            }
            else {
                pre = cur;
            }


        }



        return dummy.next;
    }
}
