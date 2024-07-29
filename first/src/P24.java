public class P24 {
    public ListNode swapPairs(ListNode head) {
        int index = 0;
        if(head==null || head.next==null){
            return head;
        }
        ListNode dummy = new ListNode();
        dummy.next =head;
        ListNode node0 = dummy;
        ListNode node1 = head;
        while(node1 !=null && node1.next != null){
            ListNode node2 = node1.next;
            ListNode node3 = node2.next;
            node0.next = node2;
            node2.next = node1;
            node1.next = node3;

            node0 = node1;
            node1 = node3;

        }
        return dummy.next;
    }
}
