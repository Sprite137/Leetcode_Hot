import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P15 {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i<nums.length; i++){
            if(i != 0 && nums[i] == nums[i-1]){
                continue;
            }
            if(nums[i] >0){
                return ans;
            }
            int left = i+1, right = nums.length-1;
            while(left < right){
                int sum = nums[i] + nums[right] + nums[left];

                if(sum <0){
                    left++;
                }else if (sum >0){
                    right--;
                }
                else {
                    ans.add(new ArrayList<>(Arrays.asList(nums[i],nums[left],nums[right])));
                    while(left < right && nums[left+1] == nums[left]){
                        left++;
                    }
                    left++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.err.println(threeSum(new int[]{-1,0,1,0}));
    }
}
