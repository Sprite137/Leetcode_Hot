import java.util.ArrayList;
import java.util.List;

/**
 * @author sprite-pc
 * @description:
 * @date 2024/8/12 23:38
 */
public class P98 {
    List<Integer> list = new ArrayList<>();
    public boolean isValidBST(TreeNode root) {
        dfs(root);
        for(int i = 0; i< list.size()-1; i++){
            if(list.get(i) >= list.get(i+1)){
                return false;
            }
        }
        return true;
    }

    public void dfs(TreeNode node){
        if(node != null){
            dfs(node.left);
            list.add(node.val);
            dfs(node.right);
        }
    }
}
