public class P543 {

    int ans = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return ans;
    }

    public void dfs(TreeNode node){
        if(node != null){
            ans = Math.max(deep(node.left,0)+deep(node.right,0),ans);
            dfs(node.left);
            dfs(node.right);
        }
    }

    public int deep(TreeNode node,int ans){
        if(node != null){
            return Math.max(deep(node.left,ans+1),deep(node.right,ans+1));
        }
        return ans;
    }

//    public static void main(String[] args) {
//
//    }
}
