/**
 * @author: xuzhi
 * @data: 2024/7/9
 */
public class P23 {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length ==0){
            return null;
        }
        ListNode ans = lists[0];
        for(int i = 1; i<lists.length; i++){
            ListNode temp = lists[i];
            ListNode curA = ans;
            ListNode curB = temp;
            ListNode tempAns = new ListNode();
            ListNode curAns = tempAns;

            while(curA != null && curB != null){
                if(curA.val <= curB.val){
                    curAns.next = new ListNode(curA.val);
                    curA = curA.next;
                    curAns = curAns.next;
                }else {
                    curAns.next = new ListNode(curB.val);
                    curB = curB.next;
                    curAns = curAns.next;
                }
            }

            if(curA == null){
                curAns.next = curB;
            }
            else {
                curAns.next = curA;
            }

            ans = tempAns.next;
        }
        return ans;
    }
}
