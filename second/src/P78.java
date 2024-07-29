import java.util.ArrayList;
import java.util.List;

public class P78 {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        back(nums,0,0,new ArrayList<>());
        return ans;
    }

    public void back(int[] nums, int index, int length, List<Integer> base){
        if(index == nums.length){
            ans.add(new ArrayList<>(base));
        }
        else {
            // 不加这个
            back(nums,index+1, length, base);


            // 加这个
            base.add(nums[index]);
            back(nums,index+1, length, base);
            base.remove(base.size()-1);

        }
    }

    public static void main(String[] args) {
        P78 x  = new P78();
        System.err.println(x.subsets(new int[]{1, 2, 3}));
    }
}
