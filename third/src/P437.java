import java.util.HashMap;
import java.util.Map;

public class P437 {
    Map<Long,Integer> map = new HashMap<>();
    int ans = 0;
    public int pathSum(TreeNode root, int targetSum) {
        map.put(0L,1);
        dfs(root,targetSum,0);
        return ans;
    }

    public void dfs(TreeNode node, int targetSum, long sum){
        if(node != null){
            sum += node.val;

            ans += map.getOrDefault(sum - targetSum,0);

            map.put(sum,map.getOrDefault(sum,0)+1);
            dfs(node.left,targetSum, sum);
            dfs(node.right,targetSum,sum);

            map.put(sum,map.get(sum)-1);
        }
    }
}
