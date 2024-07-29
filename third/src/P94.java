
import java.util.ArrayList;
import java.util.List;

public class P94 {
    List<Integer> ans = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        inorder(root);
        return ans;
    }

    public void inorder(TreeNode node){
        if(node != null){
            inorder(node.left);
            ans.add(node.val);
            inorder(node.right);
        }
    }
}
