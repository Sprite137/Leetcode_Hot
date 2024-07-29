public class P108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode ans = buildTree(nums,0,nums.length-1);
        return ans;
    }

    public TreeNode buildTree(int[] nums,int left, int right){
        if(left <= right){
            TreeNode node = new TreeNode(nums[(right+left)/2]);
            node.left = buildTree(nums,left,(right+left)/2-1);
            node.right = buildTree(nums,(right+left)/2+1,right);
            return node;
        }
        else {
            return null;
        }

    }

    public static void main(String[] args) {
        P108 p =new P108();
        p.sortedArrayToBST(new int[]{-10,-3,0,5,9});
    }
}
