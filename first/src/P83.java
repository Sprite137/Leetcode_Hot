public class P83 {
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;
        while(cur != null && cur.next!=null){
            while(cur.next!=null && cur.val == cur.next.val){
                cur.next = cur.next.next;
            }
            cur =cur.next;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,1,2};
        ListNode head = new ListNode();
        ListNode listNode = head.create(nums);
        deleteDuplicates(listNode);
    }
}
