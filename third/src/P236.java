public class P236 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return dfs(root,p,q);
    }

    public TreeNode dfs(TreeNode node,TreeNode p, TreeNode q){
        if(node == null){
            return node;
        }
        if(node == p || node == q){
            return node;
        }
        else {
            TreeNode left = dfs(node.left,p,q);
            TreeNode right = dfs(node.right,p,q);
            if(left != null && right != null){
                return node;
            }
            if(left == null){
                return right;
            }
            else{
                return left;
            }
        }
    }
}
