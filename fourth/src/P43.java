import java.util.ArrayList;
import java.util.List;

/**
 * @author: xuzhi
 * @date: 2024/8/21 19:03
 * @description:
 */

public class P43 {
    public static String multiply(String num1, String num2) {
        List<String> list = new ArrayList<>();
        for(int i = num2.length()-1; i >= 0 ; i--){
            int carry = 0;
            StringBuilder temp = new StringBuilder();
            for(int j = num1.length()-1; j >= 0 ;j--){
                int product =  (num2.charAt(i)-48) * (num1.charAt(j)-48)+carry;
                temp.append((product%10));
                carry = product/10;
            }
            if(carry !=0){
                temp.append(carry);
            }
            temp.reverse();
            for(int j = 0;j<num2.length()-1-i;j++){
                temp.append("0");
            }
            list.add(temp.toString());
        }

        StringBuilder ans = new StringBuilder();
        for(String s : list){
            ans = add(ans.toString(),s);
        }
        return String.valueOf(ans);


    }

    public static StringBuilder add(String s1, String s2){
        int index1 = s1.length()-1, index2 = s2.length()-1;
        StringBuilder ans = new StringBuilder();
        int carry = 0;
        while(index1 >=0 && index2 >=0){
            int add = s1.charAt(index1--)+s2.charAt(index2--)-96+carry;
            ans.append(add%10);
            carry = add/10;
        }
        if(index1 <0){
            while(index2 >=0){
                int add = s2.charAt(index2--)-48+carry;
                ans.append(add%10);
                carry = add/10;
            }
        }
        else {
            while(index1 >=0){
                int add = s1.charAt(index1--)-48+carry;
                ans.append(add%10);
                carry = add/10;
            }
        }
        if(carry >0){
            ans.append(carry);
        }
        return ans.reverse();
    }

    public static void main(String[] args) {
        System.err.println(multiply("123", "456"));
    }
}
