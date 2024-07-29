public class P101 {
    public boolean isSymmetric(TreeNode root) {
        return dfs(root.left,root.right);
    }

    public boolean dfs(TreeNode node1, TreeNode node2){
        if(node1 == null && node2 == null){
            return true;
        }
        if(node1 != null && node2 != null){
            return node1.val == node2.val && dfs(node1.left,node2.right) && dfs(node1.right,node2.left);
        }
        else {
            return false;
        }
    }
}
