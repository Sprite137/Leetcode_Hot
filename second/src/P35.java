public class P35 {
    public static int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length-1;
        int mid = (left+right)/2;
        while(left <= right){
            mid = (left+right)/2;
            if(nums[mid] >= target){
                if( mid ==0 || nums[mid-1] < target){
                    return mid;
                }
                right = mid -1;
            }
            else {
                left = mid + 1 ;
            }
        }
        return mid+1;

    }

    public static void main(String[] args) {
        System.err.println(searchInsert(new int[]{1, 2, 3, 4}, 5));
    }


}
