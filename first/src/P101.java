public class P101 {
    public boolean isSymmetric(TreeNode root) {
        return flag(root.left,root.right);
    }

    public boolean flag(TreeNode left,TreeNode right){
        if(left==null && right==null){
            return true;
        }
        else if(left==null || right == null){
            return false;
        }
        else if(left.val!= right.val){
            return false;
        }
        else {
            return flag(left.left,right.right) && flag(left.right,right.left);
        }

    }
}
