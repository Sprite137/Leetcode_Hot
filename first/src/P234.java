public class P234 {
    public boolean isPalindrome(ListNode head) {
        int length = 0;
        ListNode cur = head;
        while(cur!=null){
            cur = cur.next;
            length++;
        }
        if(length==1){
            return true;
        }
        ListNode half = head;
        for(int i=0;i<length/2-1;i++){
            half = half.next;
        }
        if(length%2 !=0 ){
            half = half.next;
        }

        half = swap(half,half.next);
        half = half.next;
        cur = head;
        for(int i = 0;i<length/2;i++){
            if(cur.val!=half.val){
                return false;
            }
            cur = cur.next;
            half = half.next;
        }
        return true;
    }

    public ListNode swap(ListNode head_prev,ListNode head){
        ListNode prev = null;
        ListNode cur = head;
        while(cur!=null){
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        head_prev.next = prev;
        return head_prev;
    }

    public static void main(String[] args) {
        P234 a = new P234();
        ListNode b = new ListNode();
        ListNode listNode = b.create(new int[]{1,0,0,1});
        System.err.println(a.isPalindrome(listNode));
    }
}
