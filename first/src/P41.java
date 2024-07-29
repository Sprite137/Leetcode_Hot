import java.util.Arrays;

public class P41 {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        for(int i =0;i<nums.length-1;i++){
            if(i==0 && nums[i] >0 && nums[i] !=1){
                return 1;
            }
            if(nums[i]<0 && nums[i+1]!=1){
                return 1;
            }
            else if(nums[i] > 0 && nums[i+1]!=nums[i]+1){
                return nums[i]+1;
            }
        }
        return nums[nums.length-1]+1;
    }
}
