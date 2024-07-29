public class P3 {
    public int lengthOfLongestSubstring(String s) {
        int[] bitmaps = new int[100];
        int left = 0, right = 0;
        int ans = 0;
        while(left != s.length()){
            while( right < s.length() && bitmaps[s.charAt(right)-' '] <= 0){        // 没有才能加
                bitmaps[s.charAt(right)-' ']++;
                right++;
            }
            ans = Math.max(right-left,ans);
            if(right >= s.length()){
                break;
            }
            while(left < s.length() && bitmaps[s.charAt(right) - ' '] > 0){     // 找到让right不能前进的点
                bitmaps[s.charAt(left) -' ']--;
                left++;
            }
        }
        return ans;

    }


    public static void main(String[] args) {
        P3 x=  new P3();
        System.err.println(x.lengthOfLongestSubstring("abcabcbb"));
    }
}
