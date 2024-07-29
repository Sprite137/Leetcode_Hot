public class P24 {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode node0 = dummy;

        while(true){
            ListNode node1 = node0.next;
            if(node1 == null){
                break;
            }
            ListNode node2 = node1.next;
            if(node2 == null){
                break;
            }
            ListNode node3 = node2.next;


            node0.next = node2;
            node2.next = node1;
            node1.next = node3;

            node0 = node1;
        }
        return dummy.next;
    }
}
