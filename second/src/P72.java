public class P72 {
    public int minDistance(String word1, String word2) {
        int[][] dp = new int[word1.length()+1][word2.length()+1];
        // 初始化dp，由0变为当前word的操作
        for(int i=0;i<=word1.length();i++){
            dp[i][0] =i;
        }
        for(int i=0;i<=word2.length();i++){
            dp[0][i] =i;
        }
        for (int i = 0;i<word1.length(); i++){
            for(int j = 0;j<word2.length(); j++){
                if(word1.charAt(i) == word2.charAt(j)){
                    dp[i+1][j+1] = dp[i][j];        // 当前相等，所以直接等于上一步的操作数
                }
                else {
                    dp[i+1][j+1] = Math.min(dp[i][j+1],Math.min(dp[i+1][j],dp[i][j]))+1;        // 不等，由前面插入，删除，替换三种操作的最小值+1
                }
            }
        }

        return dp[word1.length()][word2.length()];
    }

    public static void main(String[] args) {
        P72 x = new P72();
        System.err.println(x.minDistance("intention","execution"));
    }
}
