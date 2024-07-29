public class P21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode cur1 = list1;
        ListNode cur2 = list2;
        ListNode cue_ans = new ListNode(), ans = cue_ans;
        while(cur1!=null && cur2 != null){
            if(cur1.val > cur2.val){
                cue_ans.next = new ListNode();
                cue_ans.next.val = cur2.val;
                cur2 = cur2.next;
                cue_ans = cue_ans.next;
            }
            else {
                cue_ans.next = new ListNode();
                cue_ans.next.val = cur1.val;
                cur1 = cur1.next;
                cue_ans = cue_ans.next;
            }
        }
        while(cur2!=null){
            cue_ans.next = new ListNode();
            cue_ans.next.val = cur2.val;
            cur2 = cur2.next;
            cue_ans = cue_ans.next;
        }
        while(cur1!=null){
            cue_ans.next = new ListNode();
            cue_ans.next.val = cur1.val;
            cur1 = cur1.next;
            cue_ans = cue_ans.next;
        }
        return ans.next;
    }
}
