import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P15 {
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for (int i=0;i<nums.length;i++){
            if(nums[i]>0){
                break;
            }
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int left = i+1, right = nums.length-1;
            while(left < right){
                if(nums[i]+nums[left]+nums[right] > 0){
                    right--;
                }
                else if (nums[i]+nums[left]+nums[right] == 0) {
                    ans.add(new ArrayList<>(Arrays.asList(nums[i],nums[left],nums[right])));
                    while(left<right && nums[left]==nums[left+1]){
                        left++;
                    }
                    while(left<right && nums[right] == nums[right-1]){
                        right--;
                    }
                    left++;
                }
                else {
                    left++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        System.err.println(threeSum(nums));
    }
}
