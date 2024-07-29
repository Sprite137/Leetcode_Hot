public class P106 {
    public int majorityElement(int[] nums) {
        int vote = 0;
        int ans = nums[0];
        for(int num:nums){
            if(vote == 0){
                ans = num;
            }
            if(num == ans){
                vote++;
            }
            else {
                vote--;

            }
        }
        return ans;
    }
}
