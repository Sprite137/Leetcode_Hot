/**
 * @author sprite-pc
 * @description:
 * @date 2024/8/6 23:13
 */
public class P3 {
    public int lengthOfLongestSubstring(String s) {
        int[] bits = new int[127];
        int ans = 0;
        int left = 0;
        int right = 0;
        while (left != s.length()){
            while(right != s.length() && isValid(bits)){
                bits[s.charAt(right)-' ']++;
                right++;
            }
            if (isValid(bits)){
                ans = Math.max(right-left,ans);
            }
            else {
                ans = Math.max(right-left-1,ans);
            }

            while(left != s.length() && !isValid(bits)){
                bits[s.charAt(left)-' ']--;
                left++;
            }
            if(right == s.length()){
                return ans;
            }

        }
        return ans;
    }

    public boolean isValid(int[] bits){
        for(int i  : bits){
            if(i >1){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        P3 x = new P3();
        System.err.println(x.lengthOfLongestSubstring("a"));
    }
}
