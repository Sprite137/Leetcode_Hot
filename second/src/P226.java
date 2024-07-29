public class P226 {
//    public TreeNode invertTree(TreeNode root) {
//        if(root != null){
//            if(root.right == null && root.left ==null){
//
//            }
//            else if(root.right == null ){
//                root.right = new TreeNode(root.left.val);
//                root.left = null;
//            }
//            else if(root.left == null ) {
//                root.left = new TreeNode(root.right.val);
//                root.right = null;
//            }
//            else {
//                int temp = root.left.val;
//                root.left.val = root.right.val;
//                root.right.val = temp;
//            }
//
//
//            invertTree(root.right);
//            invertTree(root.left);
//        }
//        return null;
//    }
    public TreeNode invertTree(TreeNode root) {
        if(root != null){
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
            invertTree(root.left);
            invertTree(root.right);

        }
        return null;
    }
}
