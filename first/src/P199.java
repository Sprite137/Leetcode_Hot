import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class P199 {
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if(root==null){
            return new LinkedList<>();
        }
        queue.add(root);
        List<Integer> list = new LinkedList<>();
        while(!queue.isEmpty()){
            int n = queue.size();

            for(int i = 0; i<n;i++){
                TreeNode node = queue.poll();
                if(i==n-1){
                    list.add(node.val);
                }
                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
            }
        }
        return list;
    }
}
