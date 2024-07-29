import java.util.Arrays;

public class maoPao {

    public static void sort(int[] nums){
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length-i-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;

                }
            }
        }
        System.err.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] nums = {1,4,7,3,2,34,56,7,8,9,3,2,1};
        sort(nums);
    }
}
