import java.util.ArrayList;
import java.util.List;

public class P46 {

    public static void dfs(int[] nums, int k,int index , ArrayList<Integer> base, List<List<Integer>> ans){
        if(base.size()==k){
            ans.add(new ArrayList<>(base));
        }
        else {
            for(int i=0;i<nums.length;i++){
                if(!base.contains(nums[i])){
                    base.add(nums[i]);
                    dfs(nums,k,index+1,base,ans);
                    base.remove(base.size()-1);
                }

            }


        }

    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        dfs(nums,nums.length,0,new ArrayList<>(),ans);
        return ans;
    }


    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> permute = permute(nums);
        System.err.println(permute);
    }
}
