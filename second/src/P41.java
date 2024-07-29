public class P41 {
    public int firstMissingPositive(int[] nums) {
        for(int i=0; i<nums.length; i++){
            while(nums[i] >0 && nums[i] <=nums.length && nums[nums[i]-1]!=nums[i]){
                swap(nums, i, nums[i]-1);
            }
        }

        for(int i=0; i< nums.length; i++){
            if(nums[i] != i+1){
                return i+1;
            }
        }
        return nums.length+1;
    }

    private void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }

    public static void main(String[] args) {
        P41 x = new P41();
        x.firstMissingPositive(new int[]{3,4,-1,1});
    }

}
