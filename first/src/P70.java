public class P70 {
    public static int climbStairs(int n) {
        int[] dp = new int[n+2];
        dp[1]=1;
        dp[2]=2;
        if(n<=2){
            return dp[n];
        }
        for(int i=3;i<=n;i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];

    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(climbStairs(n));
    }
}
