import java.util.ArrayList;
import java.util.List;

public class P94 {
    static List<Integer> list = new ArrayList<>();
    public static List<Integer> inorderTraversal(TreeNode root) {
        dfs(root);
        return list;
    }

    public static void dfs(TreeNode node){
        if(node==null){
            return;
        }
//        list.add(node.val);
        list.add(node.val);
//        if(node.left!=null){
            dfs(node.left);
//        }
//        if(node.right!=null){
            dfs(node.right);
//        }

    }
}
