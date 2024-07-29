public class P136 {
    public static ListNode deleteNode(ListNode head, int val) {
        ListNode ans = new ListNode(0);
        ans.next = head;
        ListNode cur = ans;
        while(cur.next != null){
            if(cur.next.val == val){
                cur.next = cur.next.next;
            }
            cur = cur.next;
        }
        return ans.next;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{4,5,1,9};
        ListNode head = new ListNode();
        ListNode listNode = head.create(nums);
        deleteNode(listNode,1);
    }
}
