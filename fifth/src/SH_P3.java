import java.util.HashMap;
import java.util.Map;

/**
 * @author sprite-pc
 * @description:
 * @date 2024/10/10 16:48
 */
public class SH_P3 {
    Map<TreeNode, TreeNode> leftMap = new HashMap<>();      // 左子树的父节点
    Map<TreeNode, TreeNode> rightMap = new HashMap<>();       // 右子树的父节点
    public TreeNode pruneLeaves (TreeNode root) {

        dfs(root);

        deleteNode(root);

        return root;
    }

    public void deleteNode(TreeNode node){
        if(node != null){
            // 定义为叶子节点
            if(node.left == null && node.right == null){
                TreeNode parentNode = rightMap.get(node);
                if(parentNode != null){
                    parentNode.left = null;
                    parentNode.right = null;
                }
            }
            deleteNode(node.left);
            deleteNode(node.right);
        }
    }

    public void dfs(TreeNode node){
        if(node != null){
            if(node.left != null){
                leftMap.put(node.left,node);
                dfs(node.left);
            }
            if(node.right != null){
                rightMap.put(node.right,node);
                dfs(node.right);
            }
        }
    }

    public static void main(String[] args) {
        SH_P3 x = new SH_P3();
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        x.pruneLeaves(root);
    }
}
