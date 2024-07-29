public class P5 {
    public String longestPalindrome(String s) {
        int[][] dp = new int[s.length()][s.length()];
        int maxLen = 0;
        int maxEnd = 0;
        String reverse = new StringBuilder(s).reverse().toString();
        for(int i=0;i<s.length();i++){
            for(int j=0;j<s.length();j++){
                if(s.charAt(i)==reverse.charAt(j)){
                    if(i==0 || j==0){
                        dp[i][j] = 1;
                    }
                    else {
                        dp[i][j] = dp[i-1][j-1]+1;
                    }

                }
                if(dp[i][j] > maxLen){
                    maxLen  =dp[i][j];
                    maxEnd = i;
                }
            }

        }
        return s.substring(maxEnd-maxLen+1,maxEnd+1);
    }
}
