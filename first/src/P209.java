public class P209 {
    public static int minSubArrayLen(int target, int[] nums) {
        int left = 0, right = 0,ans = Integer.MAX_VALUE;
        int sum = 0;
        sum+=nums[right];
        while(right < nums.length && left < nums.length ){
            if(sum==target){
                ans = Math.min(ans,right-left+1);
                if(right==nums.length-1){
                    break;
                }
                sum+=nums[++right];
            } else if (sum > target) {
                ans = Math.min(ans,right-left+1);
                sum-=nums[left++];


            }
            else {
                if(right==nums.length-1){
                    break;
                }
                sum+=nums[++right];

            }
        }
        return ans==Integer.MAX_VALUE?0:ans;
    }

    public static void main(String[] args) {
        int target = 7;
        int[] nums = {2,3,1,2,4,3};
        System.err.println(minSubArrayLen(target,nums));
    }
}
