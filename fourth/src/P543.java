import java.util.List;

/**
 * @author: xuzhi
 * @date: 2024/8/11 18:05
 * @description:
 */

public class P543 {
    int ans = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return ans;
    }

    public int dfs(TreeNode node){
        if(node != null){
            int a = dfs(node.left),b = dfs(node.right);
            ans = Math.max(ans,a+b);
            return Math.max(a,b)+1;
        }
        return 0;
    }

    public static void main(String[] args) {
        P543 x= new P543();
        TreeNode root = new TreeNode(1);
        root.right  = new TreeNode(2);
        root.left = new TreeNode(1);
        System.err.println(x.diameterOfBinaryTree(root));
    }
}
