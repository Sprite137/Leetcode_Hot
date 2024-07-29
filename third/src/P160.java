public class P160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode cur1 = headA;
        ListNode cur2 = headB;
        int m = 0,n=0;
        while(cur1 != null){
            m++;
            cur1 = cur1.next;
        }
        while(cur2 != null){
            n++;
            cur2= cur2.next;
        }
        cur1 = headA;cur2 = headB;
        if(m > n){
            for(int i = 0;i<m-n;i++){
                cur1 = cur1.next;
            }
        }
        else {
            for(int i = 0;i<n-m;i++){
                cur2 = cur2.next;
            }
        }
        while(cur1 != null){
            if(cur1 == cur2){
                return cur1;
            }
            else {
                cur1 = cur1.next;
                cur2 = cur2.next;
            }
        }
        return null;

    }
}
