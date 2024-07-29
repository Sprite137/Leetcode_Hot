public class P55 {
    public boolean canJump(int[] nums) {
        boolean[] dp = new boolean[nums.length];
        dp[0] = true;
        for(int i = 0;i<nums.length; i++){
            if(dp[i]){
                for(int j = 0;j<=nums[i] && i+j < nums.length; j++){
                    dp[i+j] = true;
                }
            }
        }
        return dp[nums.length-1];
    }

    public static void test () throws Error{
        try{
            int i = 1/0;
        }
        catch (RuntimeException e){
            throw e;
        }
        System.err.println(1);
    }

    public static void main(String[] args) {
        try{
            test();
        }
        catch (Error e){
            e.printStackTrace();
            System.err.println("get");
        }
    }
}
