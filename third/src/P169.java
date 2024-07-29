public class P169 {
    public int majorityElement(int[] nums) {
        int vote = 0;
        int ans = nums[0];
        for(int i = 0; i < nums.length; i++){
            if(vote == 0){
                vote++;
                ans = nums[i];
                continue;
            }
            if(nums[i] == ans){
                vote++;
            }
            else {
                vote--;
            }
        }
        return ans;
    }
}
