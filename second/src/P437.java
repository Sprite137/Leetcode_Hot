import java.util.HashMap;
import java.util.Map;

public class P437 {
    int ans = 0;
    public int pathSum(TreeNode root, int targetSum) {
        Map<Long,Integer> map = new HashMap<>();
        map.put(0L,1);
        dfs(map,root,targetSum,0L);
        return ans;
    }

    public void dfs(Map<Long,Integer> map,TreeNode node, int target,long curSum){
        if(node == null){
            return;
        }
        curSum += node.val;
        ans += map.getOrDefault(curSum-target,0);       // 找路径的起点，从一个长路径中找短路径

        map.put(curSum, map.getOrDefault(curSum,0)+1);

        dfs(map,node.left,target,curSum);
        dfs(map,node.right,target,curSum);

        map.put(curSum,map.get(curSum)-1); // 不用从root出发，从任一节点即可


    }

    public static void main(String[] args) {
        TreeNode root = TreeNode.creatTree(new int[]{1,-2,-3});
//        System.err.println(1);
        P437 x = new P437();
        System.err.println(x.pathSum(root, -1));
    }
}
