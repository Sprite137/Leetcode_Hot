public class ListNode {
    public int val;

    public ListNode next;

    public ListNode(int i) {
        this.val =i;
    }

    public ListNode(){};

    public ListNode create(int[] nums){
        ListNode head = new ListNode();
        ListNode cur = head;

        for(int i = 0;i<nums.length;i++){
            cur.val = nums[i];
            if(i==nums.length-1){
                break;
            }
            cur.next = new ListNode();
            cur = cur.next;
        }
        return head;
    }
}
