import java.util.Map;

/**
 * @author: xuzhi
 * @date: 2024/9/9 12:56
 * @description:
 */

public class P402 {
    static int ans = Integer.MAX_VALUE;
    public static String removeKdigits(String num, int k) {
        if(k == num.length()){
            return "0";
        }

        return String.valueOf(ans);
    }

    // 超时
//    public static void dfs(int index, int length,StringBuilder base,int k,String s){
//        if(index == s.length()){
//            if(base.length() == s.length() - k){
//                ans = Math.min(ans,Integer.parseInt(base.toString()));
//            }
//        }
//
//        else{
//            // 加
//            base.append(s.charAt(index));
//            dfs(index+1,length+1,base,k,s);
//            base.deleteCharAt(base.length()-1);
//
//            // 不加
//            dfs(index+1,length,base,k,s);
//        }
//    }

    public static void main(String[] args) {
        System.err.println(removeKdigits("112", 1));
    }
}
