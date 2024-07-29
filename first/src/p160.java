public class p160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int p = 0,q = 0;
        ListNode cur_headA = headA,cur_headB = headB;
        while(cur_headA!=null){
            p++;
            cur_headA = cur_headA.next;
        }
        while(cur_headB!=null){
            q++;
            cur_headB = cur_headB.next;
        }
        if(q == Math.max(p,q)){
            for(int i =0;i <q-p;i++){
                headB = headB.next;
            }
        }
        else {
            for(int i =0;i <p-q;i++){
                headA = headA.next;
            }
        }
        while(headA!=null){
            if(headA==headB){
                return headA;
            }
            else {
                headA=  headA.next;
                headB = headB.next;
            }
        }
        return null;

    }
}
