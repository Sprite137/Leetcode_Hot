import java.util.Arrays;
import java.util.Map;

public class P45 {
    public int jump(int[] nums) {
//        int ans = 0;
        boolean[] arrived = new boolean[nums.length];
        int[] min_arr = new int[nums.length];
        Arrays.fill(min_arr,Integer.MAX_VALUE);
        min_arr[0] = 0;
        arrived[0] = true;
        for (int i = 0; i<nums.length; i++){
            if (arrived[i]){
                for(int j=0; j<=nums[i]; j++){
                    if ( (i+j)<nums.length){
                        arrived[i+j] = true;
                        min_arr[i+j] = Math.min(min_arr[i+j],min_arr[i]+1);
                    }
                }
            }
        }
        return min_arr[nums.length-1];
    }

    public static void main(String[] args) {
        P45 x = new P45();
        System.err.println(x.jump(new int[]{1, 2, 1, 1, 1}));
    }
}
