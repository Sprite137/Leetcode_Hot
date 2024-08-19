import java.util.ArrayList;
import java.util.List;

/**
 * @author sprite-pc
 * @description:
 * @date 2024/8/20 0:17
 */
public class P118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        int[][] dp = new int[numRows][numRows];
        for(int i = 0; i<numRows;i++){
            dp[i][0] = 1;
            dp[i][i] = 1;
        }
        for(int i = 0; i<numRows;i++){
            List<Integer> temp = new ArrayList<>();
            for(int j = 1;j<=i;j++){
                dp[i][j]  = dp[i-1][j-1]+dp[i-1][j];
            }
            for(int j = 1;j<=i;j++){
                temp.add(dp[i][j]);
            }
            ans.add(temp);
        }
        return ans;
    }
}
