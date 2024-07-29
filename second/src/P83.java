public class P83 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode cur = head;
        while(cur != null && cur.next != null){
            while(cur != null && cur.next != null && cur.next.val == cur.val){
                cur.next = cur.next.next;
            }
            cur = cur.next;
        }
        return head;
    }
}
