/**
 * @author: xuzhi
 * @date: 2024/8/17 13:51
 * @description:
 */

public class P35 {
    public static int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length-1;
        int mid = (left+right)/2;
        if(target < nums[0]){
            return 0;
        }
        while(left <= right){
            mid = (left+right)/2;
            if(nums[mid] > target){
                right = mid-1;
            }
            else if(nums[mid] < target){
                left = mid+1;
            }
            else {
                return mid;
            }
        }
        return mid+1;
    }

    public static void main(String[] args) {
        System.err.println(searchInsert(new int[]{1, 3, 5, 6}, 10));
    }
}
