public class P75 {
    public void sortColors(int[] nums) {
        int i = 0, two = nums.length;
        while (i < two) {
            if(nums[i] == 0){
                int temp = nums[i];
                nums[i++] = 0;
                nums[i]  =temp;
            }
            if(nums[i] == 2){
                int temp = nums[two];
                nums[two--] = 2;
                nums[i]  =temp;
            }
        }
    }
}
