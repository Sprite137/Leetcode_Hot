/**
 * @author sprite-pc
 * @description:
 * @date 2024/10/10 16:31
 */
public class SH_P2 {
    public static ListNode reverse (ListNode head) {
        int length = 0;
        ListNode cur = head;
        while(cur != null){
            cur = cur.next;
            length++;
        }

        cur = head;

        if(length %2 !=0){
            ListNode pre = cur;
            for(int i = 0; i<length/2;i++){
                pre = cur;
                cur = cur.next;
            }
            ListNode preHead = pre;
            pre = null;

            while(cur != null){
                ListNode nxt = cur.next;

                cur.next = pre;
                pre = cur;
                cur = nxt;

            }
            preHead.next = pre;



        }

        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(3);
//        head.next.next = new ListNode(4);
        reverse(head);
    }
}
