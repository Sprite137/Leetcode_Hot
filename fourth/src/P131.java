import java.util.ArrayList;
import java.util.List;

/**
 * @author: xuzhi
 * @date: 2024/8/17 13:31
 * @description:
 */

public class P131 {
    List<List<String>> ans = new ArrayList<>();
    public List<List<String>> partition(String s) {
        backTrack(0,new ArrayList<>(),s);
        return ans;
    }

    public void backTrack(int index,List<String> base,String s){
        if(index == s.length()){
            ans.add(new ArrayList<>(base));
        }else {
            for(int i = index; i<s.length();i++){
                if(isValid(s.substring(index,i+1))){
                    base.add(s.substring(index,i+1));
                    backTrack(i+1,base,s);
                    base.remove(base.size()-1);
                }
            }
        }
    }

    public boolean isValid(String s){
        for(int i = 0; i<s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length()-i-1)){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        P131 x = new P131();
        System.err.println(x.partition("aab"));
    }
}
