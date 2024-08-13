/**
 * @author: xuzhi
 * @date: 2024/8/11 14:42
 * @description:
 */

public class P2 {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode cur1 = l1, cur2 = l2;
        ListNode ans = new ListNode();
        ListNode cur = ans;


        int carry = 0;
        ListNode pre = null;
        while(cur1 != null && cur2 != null){
            cur.val =  (cur1.val+cur2.val+carry) % 10;
            cur.next = new ListNode();
            pre = cur;
            cur = cur.next;
            carry = (cur1.val+cur2.val+carry) /10;
            cur1 = cur1.next;
            cur2 = cur2.next;
        }

        if(cur1 == null){
            while(cur2 != null){
                cur.val =  (cur2.val+carry) % 10;
                cur.next = new ListNode();
                pre = cur;
                cur = cur.next;
                carry = (cur2.val+carry) /10;
                cur2 = cur2.next;
            }
        }
        else {
            while(cur1 != null){
                cur.val =  (cur1.val+carry) % 10;
                cur.next = new ListNode();
                pre = cur;
                cur = cur.next;
                carry = (cur1.val+carry) /10;
                cur1 = cur1.next;
            }
        }
        if(carry == 1){
            pre.next.val = 1;
        }
        else {
            pre.next = null;
        }
        return ans;


    }

    public static void main(String[] args) {
//        int[] l1 = {2,4,3}, l2 = {5,6,4};
//        ListNode a = new ListNode();
//        ListNode a1 = a.create(a,l1);
//        ListNode b = new ListNode();
//        ListNode b1 = a.create(b,l2);
//        ListNode c = addTwoNumbers(a1,b1);
//        c.show(c);
    }
}
