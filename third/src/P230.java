import java.util.ArrayList;
import java.util.List;

public class P230 {
    List<Integer> list = new ArrayList<>();
    int ans = 0;
    public int kthSmallest(TreeNode root, int k) {
        inOrder(root,k,0);
        return ans;
    }

    public void inOrder(TreeNode node,int k, int length){
        if(node != null){
            inOrder(node.left,k,length++);
            if(length == k){
                ans = node.val;
                return;
            }
            inOrder(node.right,k,length++);


        }
    }
}
