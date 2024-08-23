import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author sprite-pc
 * @description:
 * @date 2024/8/23 19:14
 */
public class TME_P2 {
    public TreeNode makeCompleteTree (TreeNode root) {
        // write code here
        if( isValid(root)){
            return root;
        }

        // 补全逻辑
        List<List<Integer>> list = validList(allVal(root));

        root = dfs(root,list,0,0);
        return root;


    }

    public TreeNode dfs(TreeNode node,List<List<Integer>> list,int height,int index){
        if(height == list.size()){
            return null;
        }
        if(node != null){
            if(list.get(height).size() > index){
                node.val = list.get(height).get(index);
                node.left = dfs(node.left,list,height+1,index*2);
                node.right = dfs(node.right,list,height+1,index*2+1);
                return node;
            }
            return node;

        }
        else {
            if(list.get(height).size() > index){
                node = new TreeNode(list.get(height).get(index));
                return node;
            }
            return null;

        }
    }

    public List<List<Integer>> validList(List<List<Integer>> list){
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0;i < list.size()-2; i++){
            List<Integer> temp = new ArrayList<>();
            for(int num : list.get(i)){
                temp.add(num == Integer.MAX_VALUE?1:num);
            }
            ans.add(temp);
        }
        int lastNum = 0;
        List<Integer> temp = new ArrayList<>(list.get(list.size()-1));
        for(int i = 0; i< list.get(list.size()-1).size(); i++){
            if(list.get(list.size()-1).get(i) != Integer.MAX_VALUE){
                lastNum = i;
            }
        }
        for(int i =0; i<lastNum; i++){
            if(temp.get(i) == Integer.MAX_VALUE){
                temp.set(i,1);
            }
        }
        ans.add(temp);
        return ans;
    }


    public boolean isValid(TreeNode root){
        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            List<Integer> temp = new ArrayList<>();
            for(int i = 0; i<size; i++){
                TreeNode node = queue.poll();
                if(node != null){
                    temp.add(node.val);
                    queue.add(node.left);
                    queue.add(node.right);
                }
                else {
                    temp.add(Integer.MAX_VALUE);
                }
            }
            list.add(temp);
        }

        int lastNum = 0;
        for(int num : list.get(list.size()-1)){
            if(num != Integer.MAX_VALUE){
                lastNum++;
            }
        }

        for (int i = 0; i< list.size()-1; i++) {
            int size = 0;
            if (list.get(i).get(0) == Integer.MAX_VALUE) {
                return false;
            }
            for (int num : list.get(i)) {
                if (num != Integer.MAX_VALUE) {
                    size++;
                }
            }
            if(i == list.size()-2){
                if(size < lastNum/2){
                    return false;
                }
            }
            else {
                if (size != Math.pow(2, i)) {
                    return false;
                }
            }

        }
        if(list.get(list.size()-1).get(0) == Integer.MAX_VALUE && lastNum != 0){
            return false;
        }
        return true;
    }

    public List<List<Integer>> allVal(TreeNode root){
        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            List<Integer> temp = new ArrayList<>();
            for(int i = 0; i<size; i++){
                TreeNode node = queue.poll();
                if(node != null){
                    temp.add(node.val);
                    queue.add(node.left);
                    queue.add(node.right);
                }
                else {
                    temp.add(Integer.MAX_VALUE);
                }
            }
            list.add(temp);
        }
        return list;
    }

    public static void main(String[] args) {
        TME_P2 x = new TME_P2();
        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        System.err.println(x.makeCompleteTree(root));
//        System.out.println(x.isValid(root));
    }
}
