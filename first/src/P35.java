public class P35 {
    public static int searchInsert(int[] nums, int target) {
        if(target<nums[0]){
            return 0;
        }
        if(target>nums[nums.length-1]){
            return nums.length;
        }
        int left = 0,right = nums.length-1;
        while(left<right){
            int mid = left+(right-left)/2;

            if(nums[mid]>target){
                right = mid;
            }else if(nums[mid]==target){
                return mid;
            }
            else {
                left = mid+1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] nums = {1};
        int target = 1;
        System.err.println(searchInsert(nums, target));
    }

}
