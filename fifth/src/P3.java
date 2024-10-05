/**
 * @author sprite-pc
 * @description:
 * @date 2024/10/5 23:18
 */
import java.util.*;
public class P3 {
    public static int lengthOfLongestSubstring(String s) {
        int[] counts = new int[26];
        int left = 0,right = 0;
        int ans = 1;

        while(right < s.length()){
            while(right < s.length() && isValid(counts)){
                counts[s.charAt(right++)-'a']++;

            }
            if(right == s.length()){
                break;
            }
            if(isValid(counts)){
                ans = Math.max(ans,right-left);
            }
            else{
                ans = Math.max(ans,right-left-1);
            }

            while(!isValid(counts)){
                counts[s.charAt(left++)-'a']--;
            }
        }
        while(!isValid(counts)){
            counts[s.charAt(left++)-'a']--;
        }
        ans = Math.max(ans,right-left);
        return ans;
    }

    public static boolean isValid(int[] counts){
        for(int num : counts){
            if(num > 1){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.err.println(lengthOfLongestSubstring("pwwkew"));
    }
}
