import java.util.List;

/**
 * @author: xuzhi
 * @date: 2024/8/11 15:42
 * @description:
 */

public class P23 {
    public static ListNode mergeKLists(ListNode[] lists) {

        if(lists.length == 0){
            return null;
        }
        ListNode ans = lists[0];

        for(int i = 1;i<lists.length; i++){
            // 逐步升序
            ListNode temp = new ListNode();
            ListNode cur1 = ans, cur2 = lists[i],cur = temp;
            if(cur1 == null){
                ans = cur2;
                continue;
            }
            if(cur2 == null){
                continue;
            }

            ListNode pre = null;
            while(cur1 != null && cur2 != null){
                if(cur1.val >= cur2.val){
                    cur.val = cur2.val;
                    cur2 = cur2.next;
                }
                else {
                    cur.val = cur1.val;
                    cur1 = cur1.next;
                }
                cur.next = new ListNode();
                pre = cur;
                cur = cur.next;
            }
            if (cur1 == null){
                pre.next = cur2;
            }
            else{
                pre.next = cur1;
            }
            ans = temp;

        }

        return ans;
    }

    public static void main(String[] args) {
        ListNode[] x = new ListNode[2];
        ListNode a = new ListNode();
        a.create(a,null);
        ListNode b = new ListNode();
        b.create(b,new int[]{1,2,3});
        x[0] = null;
        x[1] = b;
        a.show(mergeKLists(x));
    }


}
