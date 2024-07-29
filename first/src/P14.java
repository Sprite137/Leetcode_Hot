public class P14 {
    public String longestCommonPrefix(String[] strs) {
        int min_length = Integer.MAX_VALUE;
        for(String s:strs){
            min_length = Math.min(min_length,s.length());
        }
        if(min_length==0){
            return "";
        }
        int ans = 0 ;
        for(int i=0;i<min_length;i++){
            char a = strs[0].charAt(i);
            boolean flag = true;
            for (String str : strs) {
                if (str.charAt(i) != a) {
                    flag = false;
                    break;
                }
            }
            if(flag == false){
                break;
            }
            ans++;
        }
        return strs[0].substring(0,ans);
    }
}
