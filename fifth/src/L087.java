/**
 * @author sprite-pc
 * @description:
 * @date 2024/10/7 23:01
 */
import java.util.*;
public class L087 {
    List<String> ans  = new ArrayList<>();
    public List<String> restoreIpAddresses(String s) {
        dfs(0, 0,new ArrayList<>(),new StringBuilder(),s);
        return ans;
    }

    public void dfs(int index, int length, List<String> base, StringBuilder sb,String s){
        if(index == s.length()){
            if(base.size() == 3  && !sb.toString().isEmpty() && sb.length() <4 &&  Integer.parseInt(sb.toString()) <=255 && (Integer.parseInt(sb.toString()) > 0 || sb.toString().equals("0")) ){
                base.add(sb.toString());
                StringBuilder temp = new StringBuilder();
                for(String x : base){
                    temp.append(x);
                    temp.append(".");
                }
                ans.add(temp.substring(0,temp.length()-1).toString());
                base.remove(base.size()-1);
            }

        }
        else{
            // 截断
            if(!sb.toString().isEmpty() &&sb.length() <4 &&  Integer.parseInt(sb.toString()) <=255 && (Integer.parseInt(sb.toString()) > 0 || sb.toString().equals("0")) ){
                base.add(sb.toString());
                String temp = new String(sb.toString());
                sb = new StringBuilder();
                sb.append(s.charAt(index));
                dfs(index+1, length, base,sb,s);
                base.remove(base.size()-1);
                sb = new StringBuilder(temp);
            }

            // 继续拼
            if(!sb.toString().equals("0") && sb.length() < 4){
                sb.append(s.charAt(index));
                dfs(index+1, length,base,sb,s);
                sb.deleteCharAt(sb.length()-1);
            }

        }
    }

    public static void main(String[] args) {
        L087 x = new L087();
        System.err.println(x.restoreIpAddresses("25525511135"));
    }
}
