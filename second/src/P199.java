import java.util.*;

public class P199 {
    public List<Integer> rightSideView(TreeNode root) {
        if (root == null){
            return new ArrayList<>();
        }
        List<Integer> ans = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            System.err.println(size);
            for(int i=0;i < size; i++){
                TreeNode node =  queue.poll();
                if(i == size-1){
                    ans.add(node.val);
                }
                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }

            }
        }
        return ans;
    }
}
