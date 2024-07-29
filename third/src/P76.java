/**
* @author: xuZhi
* @data:2024/7/9
*/
public class P76 {
    public String minWindow(String s, String t) {
        if(s.length() < t.length()){
            return "";
        }
        if(s.equals(t)){
            return s;
        }
        int[] counts = new int[128];
        int left = 0,right = 0;
        int ansLeft = 0, ansRight = 0;
        int min = Integer.MAX_VALUE;
        for (char a : t.toCharArray()){
            counts[a-'A']--;
        }
        while(true){
            // 如果不包含，右边继续加
            while(right < s.length() && !isValid(counts)){
                counts[s.charAt(right++)-'A']++;
            }

            // 如果包含，那就从头开始减直到不包含
            while(left < right && isValid(counts)){
                counts[s.charAt(left++)-'A']--;
            }

            if(left ==0){
                return "";
            }

            if(right - left < min){
                min = right-left;
                ansLeft = left-1;
                ansRight = right;
            }

//            if(right - left == 0)

            if(right == s.length()){
                break;
            }
        }

            return s.substring(ansLeft,ansRight);
    }

    public boolean isValid(int[] counts){
        for(int num : counts){
            if(num < 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        P76 x = new P76();
        System.err.println(x.minWindow("Aa", "b"));
    }

}
