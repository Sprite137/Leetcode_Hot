import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class P39 {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        back(candidates, 0 , 0, target, new ArrayList<>(),0);
        List<List<Integer>> final_ans = new ArrayList<>();
        for(List<Integer> list: ans){
            list.sort((o1,o2) ->{
                return o1-o2;
            });
            if(!final_ans.contains(list)){
                final_ans.add(list);
            }

        }
        return final_ans;
    }

    public  void back(int[] candidates, int index, int length, int target, List<Integer> base,int sum){
        if(sum == target){
            ans.add(new ArrayList<>(base));
        }
        else if( sum < target){
            for (int i = 0; i<candidates.length ; i++){
                sum += candidates[i];
                base.add(candidates[i]);
                back(candidates, index,length, target,base, sum);
                sum -= candidates[i];
                base.remove(base.size()-1);
            }
        }
    }

    public static void main(String[] args) {
        P39 x = new P39();
        System.err.println(x.combinationSum(new int[]{2, 3, 6, 7}, 7));
    }
}
