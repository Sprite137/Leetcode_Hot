public class P104 {
    int max = 0;
    public int maxDepth(TreeNode root) {
        dfs(root,0);
        return max;
    }

    public void dfs(TreeNode node,int level){
        if(node != null){
            dfs(node.left,level+1);
            dfs(node.right,level+1);
        }
        else {
            max = Math.max(level,max);
        }
    }
}
