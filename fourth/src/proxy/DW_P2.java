package proxy;

import java.util.*;
/**
 * @author sprite-pc
 * @description:
 * @date 2024/9/3 19:34
 */
public class DW_P2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        int n = in.nextInt();
        int k = in.nextInt();
        String s = in.next();
        HashMap<String,Integer> map = new HashMap<>();
        int index = 0;
        while(index <= n-k){
            String temp = s.substring(index,index+k);
            if(isValid(temp)){
                map.put(temp,map.getOrDefault(temp,0)+1);
                index += k;
            }else{
                index +=1;
            }
        }
        System.out.println(Collections.max(map.values()));
    }

    public static boolean isValid(String s){
        for(int i = 0;i<s.length()-1; i++){
            if(s.charAt(i) != s.charAt(i+1)){
                return false;
            }
        }
        return true;
    }
}
