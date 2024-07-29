import java.util.Arrays;

public class kuaiSu {

    void hello(){
        System.err.println("yes");
    }



    public static void main(String[] args) {
        int[] nums = {1,4,7,3,2,34,56,7,8,9,3,2,15};
        quick_sort(nums,0,nums.length-1);
        System.err.println(Arrays.toString(nums));
    }


    public static void quick_sort(int[] nums,int left, int right){
        if(left<right){
            int partition = partition(nums,left,right);
            quick_sort(nums,left,partition-1);
            quick_sort(nums,partition+1,right);
        }
    }


    public static int partition(int[] nums, int left, int right){
        int pivot = nums[right];
        int pointer = left;
        for(int i=left;i<right;i++){
            if(nums[i]<=pivot){
                int temp = nums[i];
                nums[i] = nums[pointer];
                nums[pointer++] = temp;
            }
        }

        int temp = nums[right];
        nums[right] = nums[pointer];
        nums[pointer] = pivot;
        return pointer;
    }





}
