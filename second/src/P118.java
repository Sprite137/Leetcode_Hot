import java.util.ArrayList;
import java.util.List;

public class P118 {
    public List<List<Integer>> generate(int numRows) {
        int[][] dp = new int[numRows][numRows];
        for(int i = 0; i<numRows; i++){
            dp[i][0] = 1;
            dp[i][i] =1;
        }

        for(int i = 1;i< numRows; i++){
            for(int j = 1;j<i; j++){
                dp[i][j] = dp[i-1][j]+dp[i-1][j-1];
            }
        }
        List<List<Integer>> ans = new ArrayList<>();
        int index = 0;
        for(int[] ints: dp){
            List<Integer> temp = new ArrayList<>();
            index++;
            for(int i = 0;i<index;i++){
                temp.add(ints[i]);
            }
            ans.add(new ArrayList<>(temp));
        }
        return ans;
    }

    public static void main(String[] args) {
        P118 x = new P118();
        x.generate(5);
    }
}
