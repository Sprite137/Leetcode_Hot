import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: xuzhi
 * @data: 2024/7/11
 */
public class P139 {
    public static boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length()+1];
        dp[0] = true;

        for(int i=0; i<s.length(); i++){
            for(int j = i; j>=0; j--){
                if(wordDict.contains(s.substring(j,i+1)) && !dp[i+1]){
                        dp[i+1]=dp[j];

                }
            }
        }

        return dp[s.length()];
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList((new String[]{"a"})));
        System.err.println(wordBreak("a", list));
//        System.err.println("123".substring(0,1));
    }
}
