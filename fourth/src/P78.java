import java.util.ArrayList;
import java.util.List;

/**
 * @author sprite-pc
 * @description:
 * @date 2024/8/15 22:18
 */
public class P78 {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        backTrack(0,0,nums,new ArrayList<>());
        return ans;
    }

    public void backTrack(int index, int length, int[] nums, List<Integer> base){
        if(index == nums.length){
            ans.add(new ArrayList<>(base));
        }
        else {
            // 不选
            backTrack(index+1,length, nums,base);

            // 选
            base.add(nums[index]);
            backTrack(index+1,length,nums,base);
            base.remove(base.size()-1);

        }
    }


}
