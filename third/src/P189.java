public class P189 {
    public void rotate(int[] nums, int k) {
        k = k% nums.length;
        if(k==0){
            return;
        }

        swap(nums,0,nums.length-1);
        swap(nums,0,k-1);
        swap(nums,k,nums.length-1);
    }

    public void swap(int[] nums,int start, int end){
        for(int i = start;i<=(end+start)/2;i++){
            int temp = nums[i];
            nums[i] = nums[end-(i-start)];
            nums[end-(i-start)] = temp;
        }
    }

    public static void main(String[] args) {
        P189 x = new P189();
        x.rotate(new int[]{1,2,3,4,5,6,7},3);
    }
}
