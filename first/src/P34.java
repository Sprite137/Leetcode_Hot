public class P34 {
    public static int[] searchRange(int[] nums, int target) {
        int left = 0,right = nums.length-1;
        int ans = 0;
        while(left<=right){
            int mid = (left+right)/2;
            if(nums[mid] == target){
                ans =mid;
                break;
            }
            else if(nums[mid]>target){
                right = mid-1;
            }
            else {
                left = mid+1;
            }
        }
        if(left>right){
            return new int[]{-1,-1};
        }
        int[] res = new int[2];
        for(int i=ans;i>=0;i--){
            if(nums[i]==target){
                res[0] = i;
            }
            else {
                break;
            }
        }
        for(int i=ans;i<nums.length;i++){
            if(nums[i]==target){
                res[1] = i;
            }
            else {
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        System.err.println(searchRange(nums, target));
    }
}
