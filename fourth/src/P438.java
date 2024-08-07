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
            bits[a-'a']++;
        }

        List<Integer> ans = new ArrayList<>();

        for(int i = 0;i<=s.length()-p.length(); i++){
            int[] temp = new int[26];
            for(int j = i; j<i+p.length(); j++){
                temp[s.charAt(j)-'a']++;
            }
            if(Arrays.toString(temp).equals(Arrays.toString(bits))){
                ans.add(i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        P438 x = new P438();
        System.err.println(x.findAnagrams("cbaebabacd", "abc"));
    }
}
