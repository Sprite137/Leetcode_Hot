/**
 * @author sprite-pc
 * @description:
 * @date 2024/8/10 23:15
 */
public class P21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }
        ListNode cur1 = list1, cur2 = list2;

        ListNode ans = new ListNode();
        ListNode dummy = new ListNode();
        dummy.next = ans;
        ListNode pre = dummy;
        while(cur1 != null && cur2 != null){
            if(cur1.val >= cur2.val){
                pre.next = new ListNode(cur2.val);
                pre = pre.next;
                cur2 = cur2.next;
            }else {
                pre.next = new ListNode(cur1.val);
                pre = pre.next;
                cur1 = cur1.next;
            }

        }
        if(cur1 == null){
            pre.next = cur2;
        }
        else {
            pre.next = cur1;
        }
        return dummy.next;

    }
}
