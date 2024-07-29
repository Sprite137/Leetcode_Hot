public class P236 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if( root == null || root ==p || root == q){     // 搜寻到叶子or找到pq之一，返回root
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left,p,q);        // 寻找left
        TreeNode right = lowestCommonAncestor(root.right,p,q);      // 寻找right
        if(left == null) {          // left 为空，证明 left没有pq之一，那么一定在right之中
            return right;
        }
        if(right == null) {         // left 为空，证明 right没有pq之一， 那么一定在left中
            return left;
        }
        return root;            // 两者都不为空，证明p，q分布在两侧，返回root

    }
}
