import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @author sprite-pc
 * @description:
 * @date 2024/8/15 23:26
 */
public class P39 {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backTrack(candidates,0,0,target,new ArrayList<>());
        return ans;
    }

    public void backTrack(int[] candidates, int sum, int length, int target,List<Integer> base){
        if(sum >= target){
            if(sum == target){
                List<Integer> temp = new ArrayList<>(base);
                Collections.sort(temp);
                if(!ans.contains(temp)){
                    ans.add(temp);
                }
            }
        }
        else {
            for(int num: candidates){
                // 加
                base.add(num);
                sum += num;
                backTrack(candidates,sum,length, target,base);
                base.remove(base.size()-1);
                sum -= num;

            }
        }
    }
}
