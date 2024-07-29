import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P17 {
    List<String> ans = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        if(digits.isEmpty()){
            return ans;
        }

        back(digits,0,0, new StringBuilder(),map);
        return ans;
    }

    public void back(String digits, int index, int length, StringBuilder base, Map<Character,String> map){
        if(base.length() == digits.length()){
            ans.add(String.valueOf(base));
        }
        else {
            for(char a: map.get(digits.charAt(index)).toCharArray()){
                base.append(a);
                back(digits,index+1, length,base, map);
                base.deleteCharAt(base.length()-1);
            }
        }
    }

    public static void main(String[] args) {
        P17 x = new P17();
        System.err.println(x.letterCombinations("23"));
    }

}
