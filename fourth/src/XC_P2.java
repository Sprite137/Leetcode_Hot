/**
 * @author sprite-pc
 * @description:
 * @date 2024/9/5 19:35
 */

import java.util.*;
public class XC_P2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        long ans = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j = j+2) {
                if(j == i){
                    if(s.charAt(i) =='0'){
                        ans++;
                    }
                    continue;
                }
                long quan = 0;
                // 计算权值
                StringBuilder sb = new StringBuilder(s.substring(i, j + 1));
                int index = isValid(sb);
                while (index != -1) {
                    sb = reverse(sb, index);
                    index = isValid(sb);
                    quan++;
                }
//                for(int index = sb.length()-1;index>=0;){
//                    if(sb.charAt(index) =='0'){
//                        quan++;
//                        boolean flag = true;
//                        for(int indexTemp = 0; indexTemp<=index; indexTemp++){
//                            if(sb.charAt(indexTemp) == '0'){
//                                sb.replace(indexTemp,indexTemp+1,"1");
//                            }
//                            else {
//                                sb.replace(indexTemp,indexTemp+1,"0");
//                                index = indexTemp;
//                                flag = false;
//                            }
//                        }
//                        if(flag){
//                            index = -1;
//                        }
//                    }
//                    else {
//                        index--;
//                    }
//                }

                if (quan % 2 != 0) {
                    ans++;
                }
            }
        }
        System.out.println(ans);

    }

    public static int isValid(StringBuilder sb) {
        for (int i  = sb.length() - 1; i >= 0; i--) {
            if (sb.charAt(i) == '0') {
                return i;
            }
        }
        return -1;
    }

    public static StringBuilder reverse(StringBuilder sb, int index) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i <= index; i++) {
            if (sb.charAt(i) == '0') {
                ans.append(1);
            } else {
                ans.append(0);
            }
        }
        ans.append(sb.substring(index+1,sb.length()));
        return ans;
    }
}
