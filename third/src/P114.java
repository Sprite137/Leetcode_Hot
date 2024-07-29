import java.util.ArrayList;
import java.util.List;

public class P114 {
    List<Integer> list = new ArrayList<>();
    public void flatten(TreeNode root) {
        preOrder(root);
        TreeNode cur = root;
        for(int i = 0; i<list.size(); i++){
            cur.val = list.get(i);
            cur.left = null;
            if(i != list.size()-1){
                cur.right = new TreeNode();
            }
            cur = cur.right;
        }
    }

    public void preOrder(TreeNode node){
        if(node != null){
            list.add(node.val);
            preOrder(node.left);
            preOrder(node.right);
        }
    }
}
