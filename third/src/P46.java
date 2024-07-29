import java.util.ArrayList;
import java.util.List;

public class P46 {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        back(0,0,nums,new ArrayList<>());
        return ans;

    }

    public void back(int index, int length, int[] nums, List<Integer> base){
        if(length == nums.length){
            ans.add(new ArrayList<>(base));
        }
        else {
            for(int num: nums){
                if(!base.contains(num)){
                    base.add(num);
                    back(index,length+1,nums,base);

                    base.remove(base.size()-1);
                }
            }
        }
    }
}
