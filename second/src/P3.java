public class P3 {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        int[] bitmaps = new int[96];
        StringBuilder sb = new StringBuilder();
        for(char a: s.toCharArray()){
            if(bitmaps[a-' '] == 0){
                sb.append(a);
                bitmaps[a-' ']++;
            }
            else {
                ans = Math.max(ans,sb.length());
                while(bitmaps[a-' ']!=0){
                    bitmaps[sb.charAt(0)-' ']--;
                    sb = new StringBuilder(sb.substring(1));
                }
                sb.append(a);
                bitmaps[a-' ']++;

            }
        }

        return Math.max(ans, sb.length());
    }

    public static void main(String[] args) {
        P3 x = new P3();
        StringBuilder s = new StringBuilder();
        s.append(' ');
        System.err.println(s.length());
//        System.err.println(x.lengthOfLongestSubstring(" "));
    }
}
