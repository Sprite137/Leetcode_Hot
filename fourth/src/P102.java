import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author sprite-pc
 * @description:
 * @date 2024/8/12 23:33
 */
public class P102 {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null){
            return ans;
        }
        queue.add(root);
        while(!queue.isEmpty()){
            List<Integer> temp = new ArrayList<>();
            int size = queue.size();
            for(int i = 0; i< size; i++){
                TreeNode node = queue.poll();
                temp.add(node.val);
                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }

            }
            ans.add(temp);
        }
        return ans;
    }
}
