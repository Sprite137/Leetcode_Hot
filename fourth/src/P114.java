import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sprite-pc
 * @description:
 * @date 2024/8/13 22:17
 */
public class P114 {
    List<Integer> list = new ArrayList<>();
    public void flatten(TreeNode root) {
        dfs(root);
        TreeNode cur = root;
        for (int i = 0; i<list.size(); i++) {
            cur.val = list.get(i);
            if(i != list.size()-1){
                cur.right = new TreeNode();
                cur.left = null;
            }
            cur = cur.right;
        }
    }

    public void dfs(TreeNode node){
        if(node != null){
            list.add(node.val);
            dfs(node.left);

            dfs(node.right);
        }
    }
}
