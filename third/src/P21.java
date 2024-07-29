public class P21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ans = new ListNode();
        ListNode cur = ans;
        ListNode cur1 = list1;
        ListNode cur2  = list2;
        while(cur1 != null || cur2 != null){
            if(cur1 == null){
                cur.next = cur2;
                break;
            }
            if(cur2 == null){
                cur.next = cur1;
                break;
            }
            if(cur1.val > cur2.val){
                cur.next = new ListNode(cur2.val);
                cur = cur.next;
                cur2 = cur2.next;
            }
            else {
                cur.next = new ListNode(cur1.val);
                cur = cur.next;
                cur1 = cur1.next;
            }
        }
        return ans.next;
    }

    public static void main(String[] args) {
        ListNode x = new ListNode();
        x.create(new int[]{1});
        P21 a=  new P21();
        a.mergeTwoLists(x,null);
    }
}
