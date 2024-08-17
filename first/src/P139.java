import java.util.ArrayList;
import java.util.List;

public class P139 {


    public static boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length()+1];
        dp[0] = true;
        for(int i=1;i<=s.length();i++){
            for(int j=1; j<=i && !dp[i];j++){
                    String sub = s.substring(j-1,i);
                    if(wordDict.contains(sub)){
                        dp[i] = dp[j-1];
                    }
            }
        }

        return dp[s.length()];
    }

    public static void main(String[] args) {
        String s = "catsandog";
        String[] wordDict = {"cats","dog","sand","and","cat"};
//        System.out.println(wordBreak(s,new ArrayList<>(List.of(wordDict))));

//        Integer a = Integer.valueOf(2);
//        int b=2;
//
//        System.err.println(a==b);
    }
}
