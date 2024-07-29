import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class P105 {
    Map<Integer, Integer> indexMap;

    public TreeNode myBuildTree(int[] preorder, int[] inorder, int preorder_left, int preorder_right, int inorder_left, int inorder_right) {
        if (preorder_left > preorder_right) {       // 前序的left>right 返回null
            return null;
        }


        int preorder_root = preorder_left;      //根节点在前序的index

        int inorder_root = indexMap.get(preorder[preorder_root]);   //根节点在中序的index

        TreeNode root = new TreeNode(preorder[preorder_root]);  // 建立根节点


        int size_left_subtree = inorder_root - inorder_left;        // 左子树的节点个数为中序中 root的index-传入的left_index

        // 先序遍历中「从 左边界+1 开始的 size_left_subtree」个元素就对应了中序遍历中「从 左边界 开始到 根节点定位-1」的元素
        // 前序：左子树的根节点为当前的根节点index+1，左子树的right_index为传入的right+上一步得到的个数
        // 中序：左子树的left_index不变，right_index变为原来-1；
        root.left = myBuildTree(preorder, inorder, preorder_left + 1, preorder_left + size_left_subtree, inorder_left, inorder_root - 1);

        // 先序遍历中「从 左边界+1+左子树节点数目 开始到 右边界」的元素就对应了中序遍历中「从 根节点定位+1 到 右边界」的元素
        root.right = myBuildTree(preorder, inorder, preorder_left    + size_left_subtree + 1, preorder_right, inorder_root + 1, inorder_right);
        return root;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        // 构造哈希映射，帮助我们快速定位根节点
        indexMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            indexMap.put(inorder[i], i);
        }
        return myBuildTree(preorder, inorder, 0, n - 1, 0, n - 1);
    }
}
