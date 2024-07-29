import java.util.Arrays;

public class P31 {
    public void nextPermutation(int[] nums) {
        boolean flag  =false;
        int index = 0;
        for(int i=nums.length-1;i>0;i--){
            if(nums[i]>nums[i-1]){
                if(flag){
                    break;
                }
                for(int j = nums.length-1;j>=0;j--){
                    if(nums[j]>nums[i-1]){
                        int temp = nums[j];
                        nums[j] = nums[i-1];
                        nums[i-1] = temp;
                        flag = true;
                        index = i;
                        break;
                    }

                }


            }
        }
        if(flag){
            int x = index;
            for(int i= index;i<nums.length;i++){

                for(int j = index;j<nums.length-(x-i)-1;j++){
                    if(nums[j]>nums[j+1]){
                        int temp = nums[j];
                        nums[j] = nums[j+1];
                        nums[j+1] = temp;
                    }
                }
                x++;
            }
        }
        else {
            for(int i=0;i< nums.length/2;i++){
                int temp = nums[i];
                nums[i] =  nums[nums.length-i-1];
                nums[nums.length-i-1] = temp;

            }
        }

    }

    public static void main(String[] args) {
        int[] nums =  {1,2,3};
        P31 x = new P31();
        x.nextPermutation(nums);
        System.err.println(Arrays.toString(nums));
    }
}
