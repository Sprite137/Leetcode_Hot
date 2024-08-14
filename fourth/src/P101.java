
/**
 * @author: xuzhi
 * @date: 2024/8/11 17:47
 * @description:
 */

public class P101 {
    boolean flag = true;
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        dfs(root.left, root.right);
        return flag;
    }

    public void dfs(TreeNode node1,TreeNode node2){
        if(node1 != null && node2 != null){
            if(node1.val == node2.val){
                dfs(node1.left,node2.right);
                dfs(node1.right,node2.left);
                return;
            }
            else {
                flag = false;
                return;
            }
        }
        if(node1  == null && node2 == null){
            return;
        }
        else {
            flag = false;
        }
    }

    public static void main(String[] args) {
        P101 x= new P101();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        System.err.println(x.isSymmetric(root));
    }

}
