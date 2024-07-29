import java.util.ArrayList;
import java.util.List;

public class P78 {

    public static void qiuSubset(int index, int[] nums, List<List<Integer>> ans, ArrayList<Integer> base){
        if(index==nums.length){
            ans.add(new ArrayList<>(base));
        }
        else {
            qiuSubset(index+1,nums,ans,base);

            base.add(nums[index]);
            qiuSubset(index+1,nums,ans,base);
            base.remove(base.size()-1);
        }
    }


    public static List<List<Integer>> subsets(int[] nums) {
        if(nums.length==0){
            return new ArrayList<>();
        }
        List<List<Integer>> ans = new ArrayList<>();
        qiuSubset(0,nums,ans,new ArrayList<>());
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.err.println(subsets(nums));
    }
}
