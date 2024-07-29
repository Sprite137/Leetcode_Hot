import java.util.ArrayList;
import java.util.List;

public class P46 {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        back(nums,0,0, new ArrayList<>());
        return ans;
    }

    public void back(int[] nums,int index, int length, List<Integer> base){
        if(length == nums.length){
            ans.add(new ArrayList<>(base));
        }
        else{

            for(int i=0; i<nums.length; i++){
                if(!base.contains(nums[i])){
                    // 加这个
                    base.add(nums[i]);
                    back(nums,index,length+1,base);
                    base.remove(base.size()-1);
                }

            }



        }
    }

    public static void main(String[] args) {
        P46 x = new P46();
        System.err.println(x.permute(new int[]{1, 2, 3}));
    }
}
