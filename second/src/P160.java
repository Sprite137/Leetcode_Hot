public class P160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lengthA = 0,lengthB = 0;
        ListNode cur = headA;
        while(cur!=null){
            cur = cur.next;
            lengthA++;
        }
        cur = headB;
        while(cur!=null){
            cur = cur.next;
            lengthB++;
        }
        ListNode curA = headA;
        ListNode curB = headB;

        if(lengthA>lengthB){
            for(int i=0;i<lengthA-lengthB;i++){
                curA = curA.next;
            }
        }
        else {
            for(int i=0;i<lengthB-lengthA;i++){
                curB = curB.next;
            }
        }
        while(curA != null && curA!=curB){
            curA = curA.next;
            curB = curB.next;
        }
        return curA;
    }
}
