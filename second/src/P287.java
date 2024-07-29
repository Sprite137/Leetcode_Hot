public class P287 {
    public int findDuplicate(int[] nums) {
        int vote = 0;
        int ans = nums[0];
        for (int i = 0;i<nums.length; i++){
            if(vote == 0){
                ans = nums[i];
            }
            if(ans == nums[i]){
                vote++;
            }
            else {
                vote--;

            }
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
