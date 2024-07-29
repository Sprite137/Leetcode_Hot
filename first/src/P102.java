
import java.util.*;

public class P102 {
    public static List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null){
            return ans;
        }
        queue.add(root);
        List<Integer> list1 = new ArrayList<>();
        list1.add(root.val );
        ans.add(list1);
        while(!queue.isEmpty()){
            List<Integer> list = new ArrayList<>();
            int n = queue.size();
            for(int i=0;i<n;i++){
                TreeNode node = queue.poll();

                if(node.left!=null){
                    queue.add(node.left);
                    list.add(node.left.val);
                }
                if(node.right!=null){
                    queue.add(node.right);
                    list.add(node.right.val);
                }

            }
            if(!list.isEmpty()){
                ans.add(list);
            }


        }
        return ans;
    }

}
