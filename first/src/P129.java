
public class P129 {
    int ans = 0;
    public int sumNumbers(TreeNode root) {

        dfs(root,0);
        return ans;
    }

    public  void dfs(TreeNode node, int number) {
        number = number * 10 + node.val;
        if (node.right == null && node.left == null) {
            ans += number;
        }
        if (node.left != null) {
            dfs(node.left, number);
            if (node.right != null) {
                dfs(node.right, number);
            }
        }
    }

}
