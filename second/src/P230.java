import java.util.ArrayList;
import java.util.List;

public class P230 {
    int ans;
    int length = 1;

    public int kthSmallest(TreeNode root, int k) {
        dfs(root,k);
        return ans;
    }

    public void dfs(TreeNode node,int k){
        if(node != null){
            dfs(node.left,k);

            if(length == k){
                ans = node.val;
                return;
            }
            length++;



            dfs(node.right,k);
        }

    }

    public static void main(String[] args) {
        TreeNode x = new TreeNode();
    }

}
