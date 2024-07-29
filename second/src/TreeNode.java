import java.util.ArrayList;
import java.util.List;

public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
         this.right = right;
      }


    public static void dfs(TreeNode root){
          if(root!=null){
              System.err.println(root.val);
              dfs(root.left);
              dfs(root.right);
          }
    }

    public static TreeNode creatTree(int[] data) {
        List<TreeNode> datas = new ArrayList<TreeNode>();
        //将数组中的待添加的元素全部构建成树结点，放入datas集合中
        for (int o : data) {
            datas.add(new TreeNode(o));
        }
        TreeNode root = datas.get(0); //根结点更新为集合第一个元素
        for (int i = 0; i <= data.length / 2 - 1; i++) { //i限制不超过这个值，也就是叶结点没有子树
            if (datas.get(i) != null) { //为null时，也就是空节点了，没有子树
                datas.get(i).left = new TreeNode(datas.get(2 * i + 1).val);
                datas.get(i).right = new TreeNode(datas.get(2 * i + 2).val);
            }
        }
        return root;
    }
  }

