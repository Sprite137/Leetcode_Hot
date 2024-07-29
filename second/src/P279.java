public class P279 {
    public int numSquares(int n) {
        int[] dp = new int[n+1];
        for(int i = 1;i<=n;i++){
            if(Math.pow((int) (Math.sqrt((double) i) ),2) == i){
                dp[i] =1;
            }
            else {
                dp[i] = i;
                int x = (int) Math.sqrt((double) i);
                for(int j = 2;j<=x;j++){
                    dp[i] = Math.min(dp[j*j]+dp[i-j*j],dp[i]);
                }

            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        P279 x= new P279();
        x.numSquares(12);
    }
}
