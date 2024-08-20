import java.util.ArrayList;
import java.util.List;

/**
 * @author: xuzhi
 * @date: 2024/8/20 11:46
 * @description:
 */

public class P139 {
    public static boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length()];
        dp[0] = true;
        for(int i = 0; i<s.length(); i++){
            for(int j = 0; j<=i;j++){
                if (!dp[i] && wordDict.contains(s.substring(j, i+1))) {
                    dp[i] = dp[j];
                    break;
                }
            }
        }
        return dp[s.length()-1];
    }

    public static void main(String[] args) {
        String a = "1245";
        List<String> list = new ArrayList<>();
        list.add("leet");
        list.add("code");
        System.err.println(wordBreak("leetcode",list));
    }
}
