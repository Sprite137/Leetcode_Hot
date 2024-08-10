import org.w3c.dom.ls.LSException;

/**
 * @author: xuzhi
 * @date: 2024/8/10 18:53
 * @description:
 */

public class P206 {
    public ListNode reverseList(ListNode head) {
        ListNode cur = head;
        ListNode pre = null;

        while(cur != null){
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }
}
