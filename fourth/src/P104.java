/**
 * @author: xuzhi
 * @date: 2024/8/11 17:36
 * @description:
 */

public class P104 {
    int ans = 0;
    public int maxDepth(TreeNode root) {
        ans = dfs(root,1);
        return ans;
    }

    public int dfs(TreeNode node,int depth){
        if(node != null){
            return Math.max(dfs(node.left, depth+1),dfs(node.right, depth+1));
        }
        return depth;
    }
}
