import java.util.ArrayList;
import java.util.List;

public class P114 {
    ArrayList<Integer> list = new ArrayList<>();

    public void flatten(TreeNode root) {
        dfs(root);
        TreeNode ans = root;
        for (int i = 0; i < list.size(); i++) {
            ans.val = list.get(i);

            if(i!=list.size()-1){
                ans.left = null;
                ans.right = new TreeNode();
                ans = ans.right;
            }


        }

    }

    public void dfs(TreeNode node) {
        if (node != null) {
            list.add(node.val);
            dfs(node.left);
            dfs(node.right);
        }
    }
//    public void flatten(TreeNode root) {
//        TreeNode first = new TreeNode();
//        dfs(root);
//    }
//
//    public void dfs(TreeNode root){
//        if(root.right!=null){
//
//        }
//    }

}
