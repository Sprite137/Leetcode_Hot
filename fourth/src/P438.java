import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author sprite-pc
 * @description:
 * @date 2024/8/6 23:28
 */
public class P438 {
    // todo
    public List<Integer> findAnagrams(String s, String p) {
        int[] bits = new int[26];

        if(s.equals(p)){
            return new ArrayList<>(Collections.singletonList(0));
        }
        if(s.length() <p.length()){
            return null;
        }
        for(char a : p.toCharArray()){
            bits[a-'a']--;
        }

        List<Integer> ans = new ArrayList<>();

        int left = 0, right = 0;
        while(left != s.length()){
            // 如果无效，right++
            while( right < s.length() && !isValid(bits)){
                bits[s.charAt(right++)-'a']++;
            }

            // 如果有效 left++
            while( left <= right && isValid(bits)){
                bits[s.charAt(left)-'a']--;
                ans.add(left);
                left++;
            }

            if(right == s.length()){
                return ans;
            }
        }
        return ans;
    }

    public boolean isValid(int[] bits){
        for(int i : bits){
            if(i < 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        P438 x = new P438();
        System.err.println(x.findAnagrams("cbaebabacd", "abc"));
    }
}
