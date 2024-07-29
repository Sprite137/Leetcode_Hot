import java.util.ArrayList;
import java.util.List;

public class P131 {
    List<List<String>> ans = new ArrayList<>();
    public List<List<String>> partition(String s) {
        back(0,0,new ArrayList<>(),s);
        return ans;
    }

    public void back(int index, int length, List<String> base,String s){
        if(index == s.length()){
            ans.add(new ArrayList<>(base));
        }
        else {
            for(int i = index; i<s.length();i++){
                if(huiWen(s.substring(index,i+1))){
                    base.add(s.substring(index,i+1));
                    back(i+1,0,base,s);
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
}
