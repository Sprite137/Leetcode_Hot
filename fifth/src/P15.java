/**
 * @author sprite-pc
 * @description:
 * @date 2024/10/5 22:55
 */
import java.util.*;
public class P15 {
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] > 0){
                return ans;
            }
            if(i != 0 && nums[i] == nums[i-1]){
                continue;
            }
            int left = i+1, right = nums.length-1;
            int sum = nums[i] + nums[left] + nums[right];
            while(left < right){
                sum = nums[i] + nums[left] + nums[right];
                if(sum < 0){
                    left++;
                }
                else if(sum > 0){
                    right--;
                }
                else{
                    ans.add(new ArrayList<>(Arrays.asList(nums[i],nums[left], nums[right])));
                    while(left < right && nums[left+1] == nums[left]){
                        left++;
                    }
                    while(left < right && nums[right-1] == nums[right]){
                        right--;
                    }
                    left++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.err.println(threeSum(new int[]{-1,0,1,2,-1,-4}));
    }
}
