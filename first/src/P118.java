import java.util.ArrayList;
import java.util.List;

public class P118 {
    public static List<List<Integer>> generate(int numRows) {
        int[][] dp = new int[numRows][numRows];
        for(int i=0;i<numRows;i++){
            dp[i][0] = 1;
            dp[i][i] = 1;
        }
        int col=0;
        for(int i=1;i<numRows;i++){
            for(int j=1;j<i;j++){
                dp[i][j] = dp[i-1][j]+dp[i-1][j-1];
            }
        }
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        for(int i = 0;i<numRows;i++){
            temp = new ArrayList<>();
            for(int num:dp[i]){
                if(num!=0){
                    temp.add(num);
                }
                else {
                    ans.add(temp);
                    break;
                }
            }

        }
        ans.add(temp);
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(generate(1));
    }
}
