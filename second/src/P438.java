import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P438 {
    public List<Integer> findAnagrams(String s, String p) {
        if(s.length()<p.length()){
            return new ArrayList<>();
        }
        List<Integer> ans = new ArrayList<>();
        int[] bitMaps = new int[26];
        for(char a: p.toCharArray()){
            bitMaps[a-'a']++;
        }

        for(int i = 0; i<p.length(); i++){
            bitMaps[s.charAt(i)-'a']--;
        }
        for(int i=0; i<s.length()-p.length()+1; i++){
            if(i != 0){
                bitMaps[s.charAt(i-1)-'a']++;
                bitMaps[s.charAt(i+p.length()-1)-'a']--;
            }
            if(isValid(bitMaps)){
                ans.add(i);
            }

        }
      return ans;
    }


    public boolean isValid(int[] bitMaps){
        for(int num: bitMaps){
            if(num != 0){
                return  false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String a = "aa", b = "bb";
        P438 x = new P438();
        System.err.println(x.findAnagrams(a, b));
    }

}
