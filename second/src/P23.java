import java.util.List;

public class P23 {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode ans = new ListNode(-1);
        if(lists.length==0){
            return null;
        }
        for(ListNode head: lists) {
            ListNode headAns = ans;
            while(head != null){
                if(headAns.next == null){
                    headAns.next = head;
                    break;
                }
                if(headAns.next.val > head.val){
                    ListNode next = headAns.next;
                    headAns.next = new ListNode(head.val);
                    headAns.next.next = next;
                    headAns = headAns.next;
                    head = head.next;

                }
                else {
                    headAns  =headAns.next;
                }
            }
        }
        return ans.next;
    }
}
