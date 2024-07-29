import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P15 {
//    public List<List<Integer>> threeSum(int[] nums) {
//        Arrays.sort(nums);
//        List<List<Integer>> ans = new ArrayList<>();
//        for(int i = 0;i<nums.length-1;i++){
//            if( i != 0 && nums[i] == nums[i-1]){
//                continue;
//            }
//            if(nums[i] >0){
//                break;
//            }
//            int left = i+1, right = nums.length-1;
//            int sum = nums[i] + nums[left] + nums[right];
//            while(left < right){
//                sum = nums[i] + nums[left] + nums[right];
//                if(sum == 0){
//                    ans.add(new ArrayList<>(Arrays.asList(new Integer[]{nums[i],nums[left],nums[right]})));
//                    while(left+1 < right && nums[left+1] == nums[left]){
//                        left++;
//                    }
//
//                    while(left < right-1 && nums[right-1] == nums[right]){
//                        right--;
//                    }
//                    left++;
//
//                }
//                else if(sum > 0){
//                    right --;
//
//                }
//                else {
//                    left++;
//                }
//                if(nums[right]<0){
//                    break;
//                }
//
//            }
//        }
//        return ans;
//    }
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i<nums.length-1; i++){
            if(i != 0 && nums[i] == nums[i-1]){
                continue;
            }
            if(nums[i]> 0 ){
                return ans;
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
                else {
                    ans.add(new ArrayList<>(Arrays.asList(nums[i],nums[left],nums[right])));
                    while(left < right && nums[left] == nums[left+1]){
                        left++;
                    }
                    left++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        P15 x = new P15();
        System.err.println(x.threeSum(new int[]{-1,0,1,2,-1,-4}));
    }
}
