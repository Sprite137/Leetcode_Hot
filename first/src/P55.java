public class P55 {
    public static boolean canJump(int[] nums) {
        boolean[] can = new boolean[nums.length];
        can[0]=true;
        for(int i=0;i<nums.length-1;i++){
            if(can[i]){
                for(int j=0;j<=nums[i] && i+j<nums.length;j++){
                    can[i+j]=true;
                }
            }

        }
        return can[nums.length-1];
    }

    public static void main(String[] args) {
        int[] nums = {3,2,1,0,4};
        System.out.println(canJump(nums));
    }
}
