/**
 * @author: xuzhi
 * @date: 2024/8/21 17:22
 * @description:
 */

public class P5 {
    // 暴力解法
//    public String longestPalindrome(String s) {
//        int ansLeft = 0;
//        int ansRight = 1;
//        for(int i = 0; i<s.length(); i++){
//            for(int j = 0; j<i;j++){
//                if(isValid(s.substring(j,i+1))){
//                    if((i - j) > (ansRight-ansLeft)){
//                        ansLeft = j;
//                        ansRight = i+1;
//                    }
//                }
//            }
//        }
//
////        if(ansLeft == 0 && ansRight == 0)
//        return s.substring(ansLeft,ansRight);
//    }

    public String longestPalindrome(String s) {
        int ansLeft = 0;
        int ansRight = 1;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (s.charAt(i) == s.charAt(j) && isValid(s.substring(j, i + 1))) {

                }
            }
        }

        return s.substring(ansLeft,ansRight);
    }

    public boolean isValid(String s){
        for(int i = 0 ; i< s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length()-i-1)){
                return false;
            }
        }
        return true;
    }

}
