public class P124 {
    int ans = Integer.MIN_VALUE;
//    int[] maxSum = new int[];
    public int maxPathSum(TreeNode root) {
        dfs(root);
        return ans;
    }

    public int dfs(TreeNode node){
        if(node == null){
            return 0;
        }
        int left = dfs(node.left);      // 左子树的和
        int right = dfs(node.right);       // 右子树的和
        ans = Math.max(node.val+left+right, ans);       // 更新最大值
        return Math.max(Math.max(left, right) + node.val, 0);

    }
}
