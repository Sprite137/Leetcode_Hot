public class P189 {
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        for(int i=0; i<nums.length/2; i++){
            swap(nums,i,nums.length-i-1);
        }

        for (int i=0; i< k/2; i++){
            swap(nums,i,k-1-i);
        }

        for (int i=0 ; i< (nums.length-k)/2; i++){
            swap(nums,i+k,nums.length-i-1);
        }
//        System.err.println(1);;
    }


    public void swap(int[] nums, int left, int right){
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }

    public static void main(String[] args) {
        P189 x = new P189();
        x.rotate(new int[]{1,2}, 3);
    }
}
