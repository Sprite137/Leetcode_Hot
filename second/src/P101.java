public class P101 {
    boolean flag = true;
//    public boolean isSymmetric(TreeNode root) {
//        if(root != null){
//            if(root.left == null && root.right == null){
//            }
//            else if (root.left == null){
//                return false;
//            }
//            else if(root.right == null){
//                return false;
//            }
//            else if (root.left.val != root.right.val){
//                return false;
//            }
//
//            flag = isSymmetric(root.left) && isSymmetric(root.right);
//
//        }
//        return flag;
//    }
        public boolean isSymmetric(TreeNode root) {
            return dfs(root.left,root.right);
        }

        public boolean dfs(TreeNode left, TreeNode right){
            if((left == null && right!=null) || (right == null && left!=null)){
                return false;
            }
            if(left == null && right == null){
                return true;
            }
            if(left.val == right.val){
                return dfs(left.left,right.right) && dfs(left.right, right.left);
            }
            return false;
        }
}
