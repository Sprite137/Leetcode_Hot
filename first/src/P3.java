import java.util.HashMap;
import java.util.Map;

public class P3 {
    public static int lengthOfLongestSubstring(String s) {
        int left=0, right = left,ans = 0;
        HashMap<Character,Integer> map =new HashMap<>();
        while(left<=right && right!=s.length()){
            while(right!=s.length() && !map.containsKey(s.charAt(right))){
                map.put(s.charAt(right), 1);
                right++;
                ans = Math.max(right-left,ans);
            }
            if(right==s.length()){
                break;
            }
            while(left<=right && s.charAt(left) != s.charAt(right)){
                map.remove(s.charAt(left));
                left++;
            }
            map.remove(s.charAt(left));
            left++;
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "bbbbb";
        System.err.println(lengthOfLongestSubstring(s));
//        Map
    }
}
