public class P74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(target<matrix[0][0] || target>matrix[matrix.length-1][matrix[0].length-1]){
            return false;
        }
        int[] heads = new int[matrix.length];
        int index = 0;
        for(int[] nums:matrix){
            heads[index++] = nums[0];
        }
        index = 0;
        for(int i=0;i<heads.length;i++){
            if(heads[i]>target){
                index = i-1;
            }
        }
        int[] nums = matrix[index];

        int left = 0,right = matrix[0].length-1;
        while(left<right){
            int mid = left+(right-left)/2;
            if(nums[mid]==target){
                return true;
            }
            else if(nums[mid]>target){
                right=mid;
            }
            else {
                left = mid+1;
            }
        }
        return false;
    }
}
