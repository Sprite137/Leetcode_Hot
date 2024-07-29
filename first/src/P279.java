import java.util.Arrays;

public class P279 {
    public static int numSquares(int n) {
        int [] dp = new int[n+1];
        Arrays.fill(dp,Integer.MAX_VALUE/2);
        dp[0] = 0;
        dp[1] = 1;
        for(int i=0;i< dp.length;i++){
            for(int j=1;j<=Math.sqrt(n);j++){
                if((i+Math.pow(j,2))<=n){
                    dp[(int) (i+Math.pow(j,2))] = Math.min(dp[(int) (i+Math.pow(j,2))],dp[i]+1);
                }

            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(numSquares(13));
    }
}
