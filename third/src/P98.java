import java.util.ArrayList;
import java.util.List;

public class P98 {
    List<Integer> list = new ArrayList<>();
    public boolean isValidBST(TreeNode root) {
        inOrder(root);
        for(int i = 0;i<list.size()-1;i++){
            if(list.get(i) >= list.get(i+1)){
                return false;
            }
        }
        return true;
    }

    public void inOrder(TreeNode node){
        if(node != null){
            inOrder(node.left);
            list.add(node.val);
            inOrder(node.right);
        }
    }
}
