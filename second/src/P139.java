import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P139 {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length()+1];
        dp[0]  = true;
        for(int i = 0;i<s.length();i++){
            for(int j = i+1; j<=s.length();j++){
                if(wordDict.contains(s.substring(i,j))){
                    if(!dp[j]){
                        dp[j] = dp[i];
                    }

                }
            }
        }

        return dp[s.length()];
    }

    public static void main(String[] args) {
//        System.err.println("123".substring(0,3));
        P139 x=  new P139();
        System.err.println(x.wordBreak("aaaaaaa", new ArrayList<>(Arrays.asList("aaaa", "aaa"))));
    }
}
