import java.util.HashMap;
import java.util.Hashtable;

public class P76 {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();
        int[] counts = new int[58];
        for(int i=0;i<t.length();i++){
            counts[t.charAt(i)-'A']++;
        }
        StringBuilder cur = new StringBuilder();
        StringBuilder ans = new StringBuilder(s+"a");
        for(char a:s.toCharArray()){
            cur.append(a);
            counts[a-'A']--;
            while(isRight(counts)){
                if(ans.length()>cur.length()){
                    ans = cur;
                }
                counts[cur.charAt(0)-'A']++;
                cur = new StringBuilder(cur.substring(1, cur.length()));

            }
        }
        return ans.toString().equals(s+"a") ?"":ans.toString();
    }

    public boolean isRight(int[] counts){
        for(int num:counts){
            if(num>0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "a", t = "a";
        P76 x = new P76();
        System.err.println(x.minWindow(s, t));
    }
}
