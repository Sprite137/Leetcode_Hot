import java.util.ArrayList;
import java.util.List;

/**
 * @author: xuzhi
 * @date: 2024/8/11 17:30
 * @description:
 */

public class P94 {
    List<Integer> ans = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
         dfs(root);
         return ans;
    }

    public  void dfs(TreeNode node){
        if(node != null){
            dfs(node.left);
            ans.add(node.val);

            dfs(node.right);
        }
    }
}
