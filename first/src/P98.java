

import java.util.ArrayList;

public class P98 {
    ArrayList<Integer> integers = new ArrayList<>();
    boolean flag = true;
    public boolean isValidBST(TreeNode root) {
        inOrder(root);

        return flag;
    }

    public boolean dfs(TreeNode node){
        if(node!=null){
            if(node.left==null || (node.left.val<node.val)){
                dfs(node.left);
            }
            else {
                return false;
            }
            if(node.right==null ||( node.right.val>node.val)){
                dfs(node.right);
            }
            else {
                return false;
            }
        }
        return true;
    }

    public void inOrder(TreeNode node){
        if(node!=null){
            inOrder(node.left);
            if(integers.isEmpty()){
                integers.add(node.val);
            }
            else if(node.val<=integers.get(integers.size()-1)){
                flag = false;
                return;
            }
            else {
                integers.add(node.val);
            }
            inOrder(node.right);
        }

    }
}
