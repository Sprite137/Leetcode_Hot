import java.util.ArrayList;
import java.util.List;

public class P131 {

    public static boolean ishuiwen(String s,int start, int end){
        while(start<=end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void dfs(String s, int index,List<List<String>> ans, List<String> base){
        if(index == s.length()){
            ans.add(new ArrayList<>(base));
        }
        else {
            for(int i=index;i<s.length();i++){
                if(ishuiwen(s,index,i)){
                    base.add(s.substring(index,i+1));
                    dfs(s,i+1,ans,base);
                    base.remove(base.size()-1);
                }
            }

        }
    }
    public static List<List<String>> partition(String s) {
        List<List<String>> ans  = new ArrayList<>();
        if(s.length()==1){
            List<String> list = new ArrayList<>();
            list.add(s);
            ans.add(list);
            return ans;
        }

        dfs(s,0,ans,new ArrayList<String>());
        return ans;

    }

    public static void main(String[] args) {
        String s = "aab";
        System.out.println(partition(s));
    }
}
