public class P2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode();
        ListNode cur = ans;
        ListNode cur1 = l1;
        ListNode cur2 = l2;
        int carry = 0;
        while(cur1 != null && cur2 != null){
            int sum = cur1.val + cur2.val+carry;
            if(sum >=10){
                carry = 1;
            }
            else {
                carry = 0;
            }
            cur.next = new ListNode(sum%10);
            cur1 = cur1.next;
            cur2 = cur2.next;
            cur = cur.next;
        }
        if(cur1 == null && cur2 == null){
            if(carry >0){
                cur.next = new ListNode(carry);
            }
        }
        else if(cur1 == null){
            while (cur2 != null){
                int sum = cur2.val+carry;
                if(sum >=10){
                    carry = 1;
                }
                else {
                    carry = 0;
                }
                cur.next = new ListNode(sum%10);
                cur2 = cur2.next;
                cur = cur.next;
            }
            if(carry >0){
                cur.next = new ListNode(carry);
            }
        }
        else {
            while (cur1 != null){
                int sum = cur1.val+carry;
                if(sum >=10){
                    carry = 1;
                }
                else {
                    carry = 0;
                }
                cur.next = new ListNode(sum%10);
                cur1 = cur1.next;
                cur = cur.next;
            }
            if(carry >0){
                cur.next = new ListNode(carry);
            }
        }
        return ans.next;

    }
}
