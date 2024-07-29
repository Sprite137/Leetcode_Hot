import java.util.*;

public class P39 {
    Set<List<Integer>> ans = new HashSet<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        dfs(0,0,candidates,target,0,new ArrayList<>());
        return new ArrayList<>(ans);

    }

    public void dfs(int index, int length, int[] candidates, int target, int sum,List<Integer> base){
        if(sum >= target){
            if(sum == target){
                List<Integer> temp = new ArrayList<>(base);
                temp.sort((l1,l2) ->{
                    return l1-l2;
                });
                ans.add(temp);
            }
            else {
                return;
            }
        }
        else {
            for(int num:candidates){
                sum += num;
                base.add(num);
                dfs(index+1,length+1,candidates,target,sum,base);
                base.remove(base.size()-1);
                sum -= num;
            }
        }
    }
}
