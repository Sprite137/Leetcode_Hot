import java.io.Serializable;

public class P543 {
    int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return max;
    }

    public int dfs(TreeNode node){
        if(node == null){
            return -1;
        }

        int a = dfs(node.left)+1,b = dfs(node.right)+1;
        max = Math.max(max,a+b);
        return Math.max(a,b);

    }




}
