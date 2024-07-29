public class P5 {
    public String longestPalindrome(String s) {
        int[][] dp = new int[s.length()+1][s.length()+1];
        int ans = 0;
        int left = 0,right = 0;
        for(int i = 0;i<s.length();i++){
            for(int j = 0;j<=i;j++){
                if(huiWen(s.substring(j,i+1))){
                    if(ans < ( i-j)){
                        ans = i - j;
                        left = j;
                        right = i+1;
                    }
                }
            }
        }
        return ans == 0? String.valueOf(s.charAt(0)) : s.substring(left,right);
    }

    public boolean huiWen(String s){
        int left = 0, right = s.length()-1;
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        P5 x = new P5();
        System.err.println(x.longestPalindrome("a"));
    }
}
