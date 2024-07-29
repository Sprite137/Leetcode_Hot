import java.util.Arrays;

/**
 * @author: xuzhi
 * @data: 2024/7/16
 */
public class P31 {
    public static void   nextPermutation(int[] nums) {
        boolean flag = false;       // 1,2,3,5,4
        int index = 0;
        for(int i = nums.length-1; i > 0; i--){
            // 触发交换
            if(nums[i] > nums[i-1]){
                if(flag){
                    break;
                }
                for(int j = nums.length-1; j>=0; j--){
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
        // 1,2,4,5,3
        // 再次触发，这次交换 交换后的  index后面的升序排序
        if(flag){
//            int x = index;
//            for(int i= index;i<nums.length;i++){
//
//                for(int j = index;j<nums.length-(x-i)-1;j++){
//                    if(nums[j]>nums[j+1]){
//                        int temp = nums[j];
//                        nums[j] = nums[j+1];
//                        nums[j+1] = temp;
//                    }
//                }
//                x++;
//            }
            Arrays.sort(nums,index,nums.length);
        }
        else {
//            for(int i=0;i< nums.length/2;i++){
//                int temp = nums[i];
//                nums[i] =  nums[nums.length-i-1];
//                nums[nums.length-i-1] = temp;
//            }
            Arrays.sort(nums);
        }

    }

    public static void main(String[] args) {
        int[] num ={1,2,3,5,4};
        nextPermutation(num);
        System.err.println(Arrays.toString(num));
    }
}
