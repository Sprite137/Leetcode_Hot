

/**
 * @author sprite-pc
 * @description:
 * @date 2024/8/7 23:08
 */
public class P76 {
    public String minWindow(String s, String t) {
        if(s.length() < t.length()){
            return "";
        }
        if(s.equals(t)){
            return s;
        }

        int[] bits = new int[128];
        for(char a: t.toCharArray()){
            bits[a-' ']--;
        }

        int left = 0, right = 0;
        int ansLeft = 0, ansRight = 0;
        int minLength = Integer.MAX_VALUE;
        while(left != s.length()){
            // 直到包含t
            while(right < s.length() && !isValid(bits)){
                bits[s.charAt(right++)-' ']++;
            }

            if(left == 0 && !isValid(bits)){
                return "";
            }

            // 直到不包含t
            while(isValid(bits)){
                bits[s.charAt(left++)-' ']--;
            }

            if((right - left) < minLength){
                minLength = right - left;
                ansLeft = left;
                ansRight = right;
            }

            if(right == s.length()){
                return s.substring(ansLeft-1,ansRight);
            }


        }
        return s.substring(ansLeft-1,ansRight);
    }

    public boolean isValid(int[] bits){
        for(int i : bits){
            if(i < 0 ){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        P76 x = new P76();
        System.err.println(x.minWindow("a", "b"));
    }
}
