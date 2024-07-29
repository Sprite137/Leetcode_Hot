public class P108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return dfs(nums, 0, nums.length-1);
    }

    public TreeNode dfs(int[] nums, int left, int right){
        if(left <= right){
            int mid = (left+right)/2;
            TreeNode node = new TreeNode(nums[mid]);
            node.left = dfs(nums,left,mid-1);
            node.right  =dfs(nums,mid+1,right);
            return node;
        }
        return null;
    }

}
