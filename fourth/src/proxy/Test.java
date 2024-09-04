package proxy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author sprite-pc
 * @description:
 * @date 2024/8/28 23:24
 */
public class Test {

    static void staticMethod(){
        System.err.println("staticMethod");
    }

    Test(){
        System.err.println("generateMethod");
    }

    static class Ob{
        int a;
    }

//    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//
//        list.add("a");
//
//        list.add("b");
//
//        list.add("c");
//
//        list.add("d");
//
//        list.add("b");
//
//        int size = list.size();
//
//        for (int i = 0; i < size; i++) {
//
//            if (list.get(i).equals("b")) {
//
//                list.remove(i);
//
//            }
//
//        }
//        System.err.println(list);
//
//    }
//    public static void incr(Ob a){
//        a.a = a.a+1;
//    }

    public static void main(String[] args) {
        String a = "123334534";
        String b = "122323";
        int ans1 = 0;
        List<Integer> list = new ArrayList<>();
//        Collections.reverse();
        while (isValid(a,b)){
            ans1++;
            a = delete(a,b);
        }

        a = a+"00";
        int ans2 = 0;

        // a扩大100倍，继续减
        while (isValid(a,b)){
            ans2++;
            a = delete(a,b);
        }

        System.out.println(ans1+"."+ans2);
    }

    public static boolean isValid(String a, String b){
        // 判断大小逻辑
        if(a.length() > b.length()){
            return true;
        }
        else if (a.length() < b.length()){
            return false;
        }
        else {
            for(int i = 0;i<a.length();i++){
                if(a.charAt(i) < b.charAt(i)){
                    return false;
                }
            }
        }
        return true;
    }

    public static String delete(String a,String b){
        // 相减逻辑
        int size = b.length();
        for(int i = 0;i<a.length()-size;i++){
            b = "0"+b;
        }
        int carry = 0;
        StringBuilder ans = new StringBuilder();
        for(int i = a.length()-1; i>=0;i--){
            int temp = 0;
            if(carry >0){       // 需要借位
                if(a.charAt(i)-b.charAt(i) <0){
                    carry = 1;
                    temp = a.charAt(i)-b.charAt(i)-1;
                }else {
                    temp = a.charAt(i)-b.charAt(i)-carry;
                }
            }
            else {          // 不需借位
                if(a.charAt(i) - b.charAt(i) <0){
                    carry = 1;
                    temp = a.charAt(i)-b.charAt(i);
                }else {
                    temp = a.charAt(i)-b.charAt(i);
                }
            }

            ans.append(temp);
        }
        return ans.reverse().toString();
    }
}
