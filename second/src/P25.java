public class P25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode node0 = dummy;
        while (true){
            ListNode next = node0;
            boolean flag = true;
            for(int i=0;i<=k;i++){
                if(next == null){
                    flag = false;
                    break;
                }
                next = next.next;
            }
            if (!flag){
                break;
            }
            ListNode pre = next;
            ListNode cur = node0.next;
            ListNode x = node0.next;
            while(cur != next){
                ListNode temp = cur.next;
                cur.next = pre;
                pre = cur;
                cur = temp;
            }
            node0.next = pre;
            node0 = x;

        }
        return dummy.next;
    }
}
