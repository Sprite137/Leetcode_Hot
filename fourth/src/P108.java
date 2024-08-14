/**
 * @author sprite-pc
 * @description:
 * @date 2024/8/13 22:35
 */
public class P108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode ans = dfs(nums, 0, nums.length-1);
        return ans;
    }

    public TreeNode dfs(int[] nums, int start, int end){
        if(start <= end){
            int mid = (end+start)/2;
            TreeNode node = new TreeNode(nums[mid]);
            node.left = dfs(nums,start,mid-1);
            node.right = dfs(nums,mid+1,end);
            return node;
        }
        return null;
    }

    public static void main(String[] args) {
        P108 x = new P108();
        x.sortedArrayToBST(new int[]{-10,-3,0,5,9});
    }
}
