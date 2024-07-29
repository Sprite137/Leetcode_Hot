public class P243 {
    public boolean isPalindrome(ListNode head) {
        ListNode cur = head;
        ListNode temp = new ListNode();
        ListNode temp_head = temp;
        while(cur != null){
            temp.val = cur.val;

            if(cur.next != null){
                temp.next = new ListNode();
            }
            temp = temp.next;
            cur = cur.next;
        }


        ListNode rev = reverseList(temp_head);
        cur = head;
        while(cur != null){
            if(cur.val != rev.val){
                return false;
            }
            cur = cur.next;
            rev = rev.next;
        }
        return true;
    }

    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

    public static void main(String[] args) {
        P243 x = new P243();
        ListNode a = new ListNode();
        ListNode listNode = a.create(new int[]{1, 1, 2, 1});
        System.err.println(x.isPalindrome(listNode));
    }
}
