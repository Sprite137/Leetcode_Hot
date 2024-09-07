/**
 * @author sprite-pc
 * @description:
 * @date 2024/9/7 23:06
 */

import java.util.*;
public class MD_P3 {
    static List<String> set = new ArrayList<>();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        for(int i = 0; i<s.length(); i++){
            for(int j = i+1; j<s.length(); j++){
                StringBuilder temp = new StringBuilder();
                temp.append(s.charAt(i));
                temp.append(s.charAt(j));
                if(!set.contains(temp.toString())){
                    set.add(temp.toString());
                }
                if(!set.contains(temp.reverse().toString())){
                    set.add(temp.toString());
                }
            }
        }
        // dfs(a,0,0,new ArrayList<>(),new ArrayList<>());
        StringBuilder ans = new StringBuilder();
        for(String num : set){
            ans.append(num);
            ans.append(",");
        }
        System.out.println(ans.substring(0,ans.length()-1));
    }
}
