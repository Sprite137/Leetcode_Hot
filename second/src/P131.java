import java.util.ArrayList;
import java.util.List;

public class P131 {
    List<List<String>> ans = new ArrayList<>();
    public List<List<String>> partition(String s) {
        back(s,0,new ArrayList<>());
        return ans;
    }


    public void back(String s, int index, List<String> base){
        if(index == s.length()){
//            base.add(temp);
            ans.add(new ArrayList<>(base));
//            base.remove(base.size()-1);
        }
        else {
            for(int i = index;i<s.length(); i++){
                if(huiWen(s.substring(index,i+1))){
                    base.add(s.substring(index,i+1));
                    back(s,i+1,base);
                    base.remove(base.size()-1);
                }
            }

        }
    }


    public boolean huiWen(String base){
        int left = 0, right = base.length()-1;
        while(left < right){
            if(base.charAt(left) != base.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        P131 x = new P131();
        System.err.println(x.partition("efef"));
    }
}
