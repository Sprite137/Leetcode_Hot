public class P19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode del = head;
        int length = 0;
        while (del != null){
            del = del.next;
            length++;
        }
        del = dummy;
        for (int i=0; i<length-n; i++){
            del = del.next;
        }

        del.next = del.next.next;
        return dummy.next;
    }
}
