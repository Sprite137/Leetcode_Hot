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
    int maxDepth = 0;
    public TreeNode makeCompleteTree (TreeNode root) {
        // write code here

        // 获取最大深度
        maxDepth = maxDepth(root,0);

        // 根据最大深度获取list
        List<List<Integer>> list = getDoubleList(root);

        // 构建有效list
        list = getValidList(list);
        System.err.println(maxDepth);

        // 根据有效list构建完全二叉树
        root = makeTree(root,list,0,0);
        return root;


    }

    public int maxDepth(TreeNode node, int depth){
        if(node == null){
            return depth;
        }
        else {
            return Math.max(maxDepth(node.left,depth+1), maxDepth(node.right,depth+1));
        }
    }

    public TreeNode makeTree(TreeNode node,List<List<Integer>> list,int height,int index){
        if(height == list.size()){
            return null;
        }
        if(node != null){
            node.val = list.get(height).get(index);
            node.left = makeTree(node.left,list,height+1,index*2);
            node.right = makeTree(node.right,list,height+1,index*2+1);
            return node;

        }
        else {
            if(list.get(height).size() > index){
                node = new TreeNode(list.get(height).get(index));
                node.left = makeTree(node.left,list,height+1,index*2);
                node.right = makeTree(node.right,list,height+1,index*2+1);
                return node;
            }
            return null;

        }
    }

    public List<List<Integer>> getValidList(List<List<Integer>> list){
        List<List<Integer>> ans = new ArrayList<>();
        // 设置第0层 ~ 倒数第二层
        for(int i = 0; i<list.size()-1; i++){
            List<Integer> temp = list.get(i);
            for(int j = 0; j<temp.size(); j++){
                if(temp.get(j) == Integer.MAX_VALUE){
                    temp.set(j,1);
                }
            }
            ans.add(temp);
        }

        // 构建倒数第一层 : 最后出现的节点之前的数置1
        List<Integer> temp = list.get(list.size()-1);
        int lastIndex = 0;
        for(int j = 0; j<temp.size(); j++){
            if(temp.get(j) != Integer.MAX_VALUE){
                lastIndex = j;
            }
        }
        for(int j = 0; j<lastIndex; j++){
            if(temp.get(j) == Integer.MAX_VALUE){
                temp.set(j,1);
            }
        }

        // 构建倒数第一层 : 最后出现的节点之后的数删除
        for(int j = lastIndex+1; j<list.get(list.size()-1).size(); j++){
            temp.remove(j);
        }
        ans.add(temp);
        return ans;
    }


    public List<List<Integer>> getDoubleList(TreeNode root){
        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int depth = 0;
        while (depth < maxDepth){
            depth++;
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
                    queue.add(null);
                    queue.add(null);
                }
            }
            list.add(temp);
        }
        return list;
    }

    public static void main(String[] args) {
        TME_P2 x = new TME_P2();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        System.err.println(x.makeCompleteTree(root));
//        System.out.println(x.isValid(root));
    }
}
