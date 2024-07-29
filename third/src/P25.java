public class P25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode pre = dummy;
        ListNode cur  = pre.next;
        ListNode l2  = cur;
        while(true){
            if(l2 == null){
                return dummy.next;
            }
            for(int i = 0;i<k-1; i++){
                l2 = l2.next;

                if(l2 == null){
                    return dummy.next;
                }
            }
            ListNode l3 = l2.next;

            // 反转逻辑
            ListNode tempCur = cur;
            ListNode tempPre = null;

            while(tempCur != l3){
                ListNode tempNext = tempCur.next;
                tempCur.next = tempPre;

                tempPre = tempCur;
                tempCur = tempNext;
            }

            // 更新值
            pre.next.next = l3;
            ListNode l4 = pre.next;
            pre.next = l2;
            pre = l4;
            cur = l3;
            l2 = cur;
        }
    }

    public static void main(String[] args) {
        P25 x= new P25();
        ListNode test = new ListNode();
        ListNode listNode = test.create(new int[]{1, 2, 3, 4, 5});
        System.err.println(x.reverseKGroup(listNode,3));
    }
}
