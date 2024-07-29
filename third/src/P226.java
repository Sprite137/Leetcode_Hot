public class P226 {
    public TreeNode invertTree(TreeNode root) {
        dfs(root);
        return root;
    }

    public TreeNode dfs(TreeNode node){
        if(node != null){
            TreeNode left = dfs(node.right);
            TreeNode right = dfs(node.left);
            node.left = left;
            node.right = right;
        }
        return node;
    }
}
