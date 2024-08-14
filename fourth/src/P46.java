import java.util.ArrayList;
import java.util.List;

/**
 * @author sprite-pc
 * @description:
 * @date 2024/8/14 23:57
 */
public class P46 {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        backTrack(nums,0,0,new ArrayList<>());
        return ans;
    }

    public void backTrack(int[] nums, int length, int index, List<Integer> base){
        if(base.size() == nums.length){
            ans.add(new ArrayList<>(base));
        }
        else {
            for(int num : nums){
                if(!base.contains(num)){
                    // 不加
//                    backTrack(nums,length,index,base);


                    // 加
                    base.add(num);
                    backTrack(nums,length+1,index,base);
                    base.remove(base.size()-1);


                }


            }
        }
    }

    public static void main(String[] args) {
        P46 x= new P46();
        System.err.println(x.permute(new int[]{1, 2, 3}));
    }
}
