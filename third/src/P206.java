public class P206 {
    public boolean isPalindrome(ListNode head) {
        int length = 0;
        ListNode cur = head;
        while(cur != null){
            length++;
            cur = cur.next;
        }
//        if(length ==2){
//            if(head.val == head.next.val){
//                return true;
//            }
//            else {
//                return false;
//            }
//        }

        if(length %2 ==0){
            ListNode pre  = head;
            for(int i = 0;i<length/2-1;i++){      // length为偶数
                pre = pre.next;
            }

            ListNode x2 = new ListNode();
            x2.next = pre.next;
            x2 = x2.next;
            pre.next = null;
            ListNode x = reverse(head);
            while(x != null){
                if(x.val != x2.val){
                    return false;
                }
                x2 = x2.next;
                x = x.next;
            }
            return true;
        }
        else {
            ListNode pre  = head;
            for(int i = 0;i<length/2;i++){      // length为奇数
                pre = pre.next;
            }
            ListNode x2 = new ListNode();
            x2.next = pre.next;
            x2 = x2.next;
            pre.next = null;
            ListNode x = reverse(head);
            x = x.next;
            while(x != null){
                if(x.val != x2.val){
                    return false;
                }
                x2 = x2.next;
                x = x.next;
            }
            return true;
        }

    }
    public ListNode reverse(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null){
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }

    public static void main(String[] args) {
        ListNode x = new ListNode();
        ListNode listNode = x.create(new int[]{1,1});
        P206 p = new P206();
        System.err.println(p.isPalindrome(listNode));
    }
}
