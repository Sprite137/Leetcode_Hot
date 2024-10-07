/**
 * @author sprite-pc
 * @description:
 * @date 2024/10/7 13:49
 */
import java.util.*;


public class P131 {
    List<List<String>> ans = new ArrayList<>();
    public List<List<String>> partition(String s) {
        dfs(0,0,s,new ArrayList<>(), new StringBuilder());
        return ans;
    }

    public void dfs(int index, int length, String s, List<String> base,StringBuilder sb){
        if(index == s.length()){
            if(isValid(sb.toString())){
                base.add(sb.toString());
                ans.add(new ArrayList<>(base));
                base.remove(base.size()-1);
            }

        }
        else{
            // 往下继续拼
            sb.append(s.charAt(index));
            dfs(index+1, length, s, base, sb);
            sb.deleteCharAt(sb.length()-1);

            if(!sb.toString().isEmpty() && isValid(sb.toString())){
                // 重新拼
                base.add(sb.toString());
                sb = new StringBuilder();
                sb.append(s.charAt(index));
                dfs(index+1, length, s, base, sb);
//                sb = new StringBuilder(base.get(base.size()-1));
                base.remove(base.size()-1);


            }


        }

    }

    public boolean isValid(String temp){
        int left =0, right = temp.length()-1;
        while(left < right){
            if(temp.charAt(left) != temp.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        P131 x = new P131();
        System.err.println(x.partition("aab"));
    }
}
