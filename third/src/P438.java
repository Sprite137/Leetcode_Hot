import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P438 {
    public List<Integer> findAnagrams(String s, String p) {
        if(s.length() < p.length()){
            return new ArrayList<>();
        }
        int[] p_bitmaps = new int[26];
        for(char ch: p.toCharArray()){
            p_bitmaps[ch-'a']++;
        }
        String p_counts = Arrays.toString(p_bitmaps);
        List<Integer> ans = new ArrayList<>();
        int[] s_bitmaps = new int[26];
        for(int i = 0;i<p.length();i++){
            s_bitmaps[s.charAt(i)-'a']++;
        }
        for(int i = 0;i<s.length() - p.length();i++){
            String temp = Arrays.toString(s_bitmaps);
            if(temp.equals(p_counts)){
                ans.add(i);
            }
            s_bitmaps[s.charAt(i)-'a']--;
            s_bitmaps[s.charAt(i+p.length())-'a']++;

        }
        String temp = Arrays.toString(s_bitmaps);
        if(temp.equals(p_counts)){
            ans.add(s.length()-p.length());
        }
        return ans;
    }

    public static void main(String[] args) {
        P438 x= new P438();
        System.err.println(x.findAnagrams("cbaebabacd", "abc"));
    }
}
