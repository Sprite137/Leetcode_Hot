/**
 * @author sprite-pc
 * @description:
 * @date 2024/10/5 23:33
 */
import java.util.*;
public class P438 {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        char[] pArray = p.toCharArray();
        Arrays.sort(pArray);
        if(s.length() < p.length()){
            return ans;
        }
        for(int i = 0; i < s.length()-p.length()+1; i++){
            char[] temp = s.substring(i,i+p.length()).toCharArray();
            Arrays.sort(temp);
            if(Arrays.toString(pArray).equals(Arrays.toString(temp))){
                ans.add(i);
            }
        }
        return ans;
    }
}
