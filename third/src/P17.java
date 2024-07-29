import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P17 {
    List<String> ans = new ArrayList<>();
    Map<Character,String> map = new HashMap<>();
    public List<String> letterCombinations(String digits) {
        map.put('1',"");
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        if(digits.length() == 0){
            return ans;
        }
        dfs(0,0,new StringBuilder(),digits);
        return ans;
    }

    public void dfs(int index, int  length, StringBuilder base, String digits ){
        if(base.length() == digits.length()){
            ans.add(base.toString());
        }
        else {
            for(char ch : map.get(digits.charAt(index)).toCharArray()){
                base.append(ch);
                dfs(index+1,length+1, base,digits);
                base.deleteCharAt(base.length()-1);
            }
        }
    }

    public static void main(String[] args) {
        P17 x = new P17();
        System.err.println(x.letterCombinations(""));

    }


}
