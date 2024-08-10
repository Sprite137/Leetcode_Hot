import java.util.List;

/**
 * @author: xuzhi
 * @date: 2024/8/10 17:44
 * @description:
 */

public class P160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lengthA = 0, lengthB = 0;
        ListNode curA = headA, curB = headB;

        while(curA != null){
            lengthA++;
            curA = curA.next;
        }

        while(curB != null){
            lengthB++;
            curB = curB.next;
        }

        curA = headA;
        curB = headB;

        if(lengthA >= lengthB){
            for(int i = 0;i<lengthA - lengthB; i++){
                curA = curA.next;
            }
        }
        else {
            for(int i = 0;i<lengthB - lengthA; i++){
                curB = curB.next;
            }
        }

        while(curA != null){
            if(curA == curB){
                return curA;
            }
            else {
                curA = curA.next;
                curB = curB.next;
            }
        }
        return null;
    }
}
