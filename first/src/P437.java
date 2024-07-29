import java.util.HashMap;
import java.util.Map;

public class P437 {
    public int pathSum(TreeNode root, int sum) {
        // key是前缀和, value是大小为key的前缀和出现的次数
        Map<Long, Integer> prefixSumCount = new HashMap<>();
        // 前缀和为0的一条路径
        prefixSumCount.put(0L, 1);
        // 前缀和的递归回溯思路
        return recursionPathSum(root, prefixSumCount, sum, 0L);
    }

    private int recursionPathSum(TreeNode node, Map<Long, Integer> prefixSumCount, int target, long currSum) {
        if (node == null) {
            return 0;
        }

        int res = 0;
        currSum += node.val;

        res += prefixSumCount.getOrDefault(currSum - target, 0);

        prefixSumCount.put(currSum, prefixSumCount.getOrDefault(currSum, 0) + 1);

        res += recursionPathSum(node.left, prefixSumCount, target, currSum);
        res += recursionPathSum(node.right, prefixSumCount, target, currSum);

        prefixSumCount.put(currSum, prefixSumCount.get(currSum) - 1);
        return res;
    }
}
