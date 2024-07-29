public class P543 {
    int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        max = Math.max(dfs(root.left)+dfs(root.right),max);
        diameterOfBinaryTree(root.left);
        diameterOfBinaryTree(root.right);
        return max;
    }

    public int dfs(TreeNode node){
        if(node==null){
            return 0 ;
        }
        return Math.max(dfs(node.left)+1,dfs(node.right)+1);
    }
}
