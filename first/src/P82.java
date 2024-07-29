import java.util.HashMap;
import java.util.HashSet;

public class P82 {
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;
        HashMap<Integer,Integer> map =new HashMap<>();
        while(cur!=null){
            map.put(cur.val,map.getOrDefault(cur.val,0)+1);
            cur = cur.next;
        }
        ListNode ans = new ListNode(0);
        ans.next = head;
        cur = ans;
        while(cur.next!=null){
            boolean flag = false;
            while(cur.next.next != null && cur.next.next.val == cur.next.val){
                cur.next = cur.next.next;
                flag = true;
            }

                cur.next = cur.next.next;
//            }
        }
        return ans.next;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,3,4,4,5};
        ListNode head = new ListNode();
        ListNode listNode = head.create(nums);
        deleteDuplicates(listNode);
    }
}
