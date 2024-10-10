public class ListNode {
    public int val;

    public ListNode next;

    public ListNode(int i) {
        this.val =i;
    }

    public ListNode(){};

    public void create(ListNode node,int[] nums){
        ListNode cur = node;

        if(nums == null){
            node = null;
            return;
        }
        for(int i = 0;i < nums.length;i++){
            cur.val = nums[i];
            if(i==nums.length-1){
                break;
            }
            cur.next = new ListNode();
            cur = cur.next;
        }
    }

    public void show(ListNode node){
        ListNode cur = node;
        while(cur != null){
            System.err.println(cur.val);
            cur = cur.next;
        }
    }
}
