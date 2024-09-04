import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

/**
 * @author sprite-pc
 * @description:
 * @date 2024/8/28 20:21
 */
public class DW_P3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        long ans = 0L;
        long[] hong = new long[n];
        long[] zi = new long[n];
        long[] incrHong = new long[n];
        long[] incrZi = new long[n];
        for(int i = 0;i<n; i++){
            hong[i] = in.nextLong();
            if(i !=0){
                incrHong[i] = hong[i] - hong[i-1];
            }

        }
        for(int i = 0;i<n; i++){
            zi[i] = in.nextLong();
            if(i !=0){
                incrZi[i] = zi[i] - zi[i-1];
            }

        }
        int[] dp = new int[n];
        dp[0] =1;
        for(int i = 1;i<n;i++){
            if(incrHong[i] == incrZi[i]){
                dp[i] = dp[i-1]+1;
            }
            else {
                dp[i] = 1;
            }
            ans = Math.max(dp[i],ans);
        }

        System.out.println(ans);
    }
}
