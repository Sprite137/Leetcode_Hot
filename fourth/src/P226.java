/**
 * @author: xuzhi
 * @date: 2024/8/11 17:44
 * @description:
 */

public class P226 {
    public TreeNode invertTree(TreeNode root) {
        dfs(root);
        return root;
    }

    public void dfs(TreeNode node){
        if(node != null){
            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;
            dfs(node.left);
            dfs(node.right);
        }
    }


}
