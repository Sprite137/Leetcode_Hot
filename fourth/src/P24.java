/**
 * @author: xuzhi
 * @date: 2024/8/11 15:20
 * @description:
 */

public class P24 {
    public static ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode();
        dummy.next = head;

        ListNode cur = dummy.next;
        ListNode pre = dummy;

        while(true){
            if(cur == null || cur.next == null){
                break;
            }
            ListNode temp = cur.next;
            cur.next = temp.next;
            temp.next = cur;
            pre.next = temp;

            pre = cur;
            cur = cur.next;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode x = new ListNode();
        x.create(x,new int[]{1,2,3,4});
        x.show(swapPairs(x));
    }
}
