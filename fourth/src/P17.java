import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author sprite-pc
 * @description:
 * @date 2024/8/15 22:36
 */
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
        backtrack(0, 0, new StringBuilder(),digits);
        return ans;
    }

    public void backtrack(int index, int length, StringBuilder sb,String digits){
        if(sb.length() == digits.length()){
            ans.add(sb.toString());
        }
        else {
            for(int i = 0;i<map.get(digits.charAt(index)).length(); i++){
                sb.append(map.get(digits.charAt(index)).charAt(i));
                backtrack(index+1,length+1,sb,digits);
                sb.deleteCharAt(sb.length()-1);
            }
        }
    };

    public static void main(String[] args) {
        StringBuilder a = new StringBuilder("abc");
        a.deleteCharAt(3);
    }
}
