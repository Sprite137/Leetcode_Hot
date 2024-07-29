import java.util.HashMap;
import java.util.Map;

public class P105 {
    Map<Integer,Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i = 0; i<inorder.length; i++){
            map.put(inorder[i],i);
        }
        return build(preorder,inorder,0,preorder.length-1,0,inorder.length-1);
    }

    public TreeNode build(int[] preorder, int[] inorder, int pre_left, int pre_right, int in_left, int in_right){
        if(pre_left > pre_right){
            return null;
        }
        int index = map.get(preorder[pre_left]);

        int left_size = index - in_left;

        TreeNode node = new TreeNode(preorder[pre_left]);

        node.left = build(preorder, inorder, pre_left+1,pre_left+left_size,in_left,in_left+left_size-1);

        node.right = build(preorder, inorder, pre_left+left_size+1,pre_right, in_left+left_size+1, in_right);
        return node;
    }
}
