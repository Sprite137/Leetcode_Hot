
public class P104 {
//    int ans=0;
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int ans = dfs(root);
        return ans+1;
    }

    public int  dfs(TreeNode node){
        if(node==null){
            return 0;
        }
//        if(node.left!=null && node.right!=null){
            return Math.max(dfs(node.left)+1,dfs(node.right)+1);
//        }
//        if(node.left==null && node.right!=null){
//            return Math.max(dfs(node.left),dfs(node.right)+1);
//        }
//        if(node.left != null){
//            return Math.max(dfs(node.left)+1,dfs(node.right));
//        }
//        return 0;

    }



}
