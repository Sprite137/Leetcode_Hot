public class P136 {
    public int singleNumber(int[] nums) {
        int ans = nums[0];
        for(int i = 1;i<nums.length-1;i++){
            ans = ans ^ nums[i];
        }
        return ans;
    }
}
