public class P104 {
    public int maxDepth(TreeNode root) {
        return dfs(root,0);

    }

    public int dfs(TreeNode node,int ans){
        if(node != null){
            return Math.max(dfs(node.left,ans+1), dfs(node.right,ans+1));
        }
        return ans;
    }
}
