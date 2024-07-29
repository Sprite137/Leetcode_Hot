import java.util.ArrayList;
import java.util.List;

public class P78 {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        back(0,0,nums,new ArrayList<>());
        return ans;
    }

    public void back(int index, int length, int[] nums, List<Integer> base){
        if(index == nums.length){
            ans.add(new ArrayList<>(base));
        }
        else {
            back(index+1,length,nums,base);

            base.add(nums[index]);
            back(index+1,length,nums,base);
            base.remove(base.size()-1);



        }
    }
}
