public class P238 {
    public int[] productExceptSelf(int[] nums) {
        int[] pre = new int[nums.length];
        int[] aft = new int[nums.length];
        int res = 1;
        for(int i = 0;i<nums.length; i++){
            pre[i] = res;
            res *= nums[i];
        }
        res=1;
        for(int i = nums.length-1; i>=0; i--){
            aft[i] = res;
            res *= nums[i];
        }
        int[] ans = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            ans[i] = pre[i] * aft[i];
        }
        return ans;
    }
}
