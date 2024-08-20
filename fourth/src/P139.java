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
        for(int i = 0; i<s.length(); i++){
            for(int j = 0; j<=i;j++){
                if (!dp[i] && wordDict.contains(s.substring(j, i+1))) {
                    if(j == 0){
                        dp[i] = true;
                    }
                    else {
                        dp[i] = dp[j-1];
                    }

//                    break;
                }
            }
        }
        return dp[s.length()-1];
    }

    public static void main(String[] args) {
        String a = "1245";
        List<String> list = new ArrayList<>();
        list.add("dog");
        list.add("s");
        list.add("gs");
        System.err.println(wordBreak("dogs",list));
    }
}
