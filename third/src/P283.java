import java.util.Arrays;

public class P283 {

    public void moveZeroes(int[] nums) {
        int slowIndex = 0, fastIndex = 0;
        for(int i = 0; i < nums.length; i++){

            // 当前不为0，那么两个指针都向前
            if(nums[i] != 0){
                slowIndex++;
                fastIndex++;
            }
            // 当前为0，那么fastIndex向前， slowIndex不动
            else {
                fastIndex++;
            }

            // 两个指针不同，那么将fastIndex的值赋值给slowIndex
            if(slowIndex != fastIndex){
                nums[slowIndex] = nums[fastIndex == nums.length ? fastIndex-1: fastIndex];
            }
        }

        for(int i = slowIndex; i < nums.length; i++){
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        P283 x = new P283();
        int[] nums = new int[]{0};
        x.moveZeroes(nums);
        System.err.println(Arrays.toString(nums));
    }
}
