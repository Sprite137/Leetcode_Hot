/**
 * @author: xuzhi
 * @date: 2024/8/21 17:43
 * @description:
 */

public class P72 {
    public static int minDistance(String word1, String word2) {
        int[][] dp = new int[word1.length()+1][word2.length()+1];
        for (int i = 0; i <= word1.length(); i++){
            for(int j = 0 ; j <= word2.length(); j++){
                dp[i][0] = i;
                dp[0][j] = j;
            }
        }

        for(int i = 0 ;i<word1.length(); i++){
            for(int j = 0; j<word2.length(); j++){
                if(word1.charAt(i) == word2.charAt(j)){
                    dp[i+1][j+1] = dp[i][j];
                }
                else {
                    dp[i+1][j+1] = Math.min(Math.min(dp[i][j+1],dp[i+1][j]),dp[i][j])+1;
                }
            }

        }

        return dp[word1.length()][word2.length()];
    }

    public static void main(String[] args) {
        System.err.println(minDistance("horse", "ros"));
    }
}
