import java.util.ArrayList;
import java.util.List;

/**
 * @author sprite-pc
 * @description:
 * @date 2024/8/13 20:52
 */
public class P230 {
    int index = 1;
    int ans = 0;
    public int kthSmallest(TreeNode root, int k) {
        dfs(root,k);
        return ans;
    }

    public void dfs(TreeNode node, int k){
        if(node != null){

            dfs(node.left,k);
            if(index >= k){
                if(index >k){
                    return;
                }
                ans = node.val;
                index++;
                return;
            }
            index++;
            dfs(node.right,k);
        }
    }
}
