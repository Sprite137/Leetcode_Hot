import java.util.Arrays;

public class P152 {
    public int maxProduct(int[] nums) {
        int[] dpPos = new int[nums.length+1];
        int ans = Integer.MIN_VALUE;
        int[] dpNeg = new int[nums.length+1];
        for(int i = 0; i<nums.length; i++){
            dpPos[i+1] = nums[i];
            dpNeg[i+1] = nums[i];
        }
        dpPos[0] = 1;
        dpNeg[0] = 1;
//        Arrays.fill(dpNeg,1);
//        Arrays.fill(dpPos,1);
        for(int i = 0;i<nums.length;i++){
            dpPos[i+1] = Math.max(dpPos[i+1],Math.max(dpNeg[i]*nums[i],dpPos[i]*nums[i]));
            dpNeg[i+1] = Math.min(dpNeg[i+1],Math.min(dpNeg[i]*nums[i],dpPos[i]*nums[i]));
            ans = Math.max(ans,dpPos[i+1]);
        }

        return ans;
    }

    public static void main(String[] args) {
        P152 x= new P152();
        System.err.println(x.maxProduct(new int[]{2,3,-2,4}));
    }
}
