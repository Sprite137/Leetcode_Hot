public class P35 {
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length-1;
        int mid = (left+right)/2;
        while(left <= right){
            mid = (left+right)/2;
            if(nums[mid] == target ){
                return mid;
            }
            else  if(nums[mid] > target){
                if(mid == 0 || nums[mid-1] < target){
                    right = mid-1;
                }

            }
            else {
                left = mid+1;
            }
        }
        return mid;
    }
}
