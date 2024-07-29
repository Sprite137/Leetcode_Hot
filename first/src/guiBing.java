import java.util.Arrays;

public class guiBing {

    public static void main(String[] args) {
        int[] nums = {1,4,7,3,2,34,56,7,8,9,3,2,15};
        mergeSort(nums,0,nums.length-1);
        System.err.println(Arrays.toString(nums));
    }

    public static void mergeSort(int[] nums, int left, int right){
        if(left<right){
            int mid = (left+right)/2;
            mergeSort(nums,left,mid);
            mergeSort(nums,mid+1,right);
            merge(nums,left,mid,right);
        }
    }

    public static void merge(int[] nums, int start, int mid, int end){
        int[] arrays = new int[end-start+1];
        int left = start;
        int right = mid+1;
        for(int i=0;i<arrays.length;i++){
            if(left>mid){
                arrays[i] = nums[right++];
            } else if (right>end) {
                arrays[i] = nums[left++];
            }
            else if(nums[left] > nums[right]){
                arrays[i] = nums[right++];
            }
            else {
                arrays[i] = nums[left++];
            }
        }

        for(int i=0;i< arrays.length;i++){
            nums[i+start] = arrays[i];
        }
    }

//    private static void mergeSort(int[] nums,int left, int right){
//        if(left<right){
//            int mid = (left+right)/2;
//            mergeSort(nums,left,mid);
//            mergeSort(nums,mid+1,right);
//            merge(nums,left,mid,right);
//        }
//    }
//
//    private static void merge(int[] nums, int start, int mid, int end){
//        int[] array = new int[end-start+1];
//        int left = start;
//        int right = mid+1;
//        for(int i=0;i<array.length;i++){
//            if(left>mid){
//                array[i] = nums[right++];
//            }
//            else if (right > end){
//                array[i] = nums[left++];
//            }
//            else if(nums[left]>nums[right]){
//                array[i] = nums[right++];
//            }
//            else {
//                array[i] = nums[left++];
//            }
//        }
//
//        for(int i=0;i<array.length;i++){
//            nums[i+start] = array[i];
//        }
//    }


}
