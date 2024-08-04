public class P572 {

//    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
//
//        if(root != null && subRoot != null){
//            // 两个值不相等，直接root往下判断
//            if(root.val != subRoot.val){
//                return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot)  ;
//            }
//            // 两个值相等：
//            //
//            else {
//                return (isSubtree(root.left,subRoot.left) && isSubtree(root.right,subRoot.right)) || (root.left != null && root.left.val == root.val && (isSubtree(root.left, subRoot)) || (root.right != null && root.right.val == root.val && (isSubtree(root.right, subRoot))));
//            }
//        }
//        if(root != null){
//            return isSubtree(root.left,subRoot)
//        }
//    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(subRoot == null){
            return true;
        }
        if(root == null){
            return false;
        }

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot) || isSameTree(root, subRoot);
    }

    public boolean isSameTree(TreeNode node, TreeNode subNode){
        if (node == null && subNode == null) return true;
        if (node == null || subNode == null) return false;
        if(node.val != subNode.val){
            return false;
        }
        return isSameTree(node.left, subNode.left) && isSameTree(node.right, subNode.right);
    }


    /*
    *               3
    *              / \
    *             4   5
    *            / \ / \
    *           1    2
    *
    *  */
}
