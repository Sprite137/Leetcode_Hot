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

//      static TreeNode create_layer(int[] nums){
////          TreeNode head = new TreeNode();
////          TreeNode cur = new TreeNode();
////          for(int i=0;i<nums.length;i++){
////              if(nums[i]!=-1){
////                  cur.val = nums[i];
////              }
////              cur = cur.left;
////
////          }
//      }
    public static void dfs(TreeNode root){
          if(root!=null){
              System.err.println(root.val);
              dfs(root.left);
              dfs(root.right);
          }
    }
  }

