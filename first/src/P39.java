import java.util.*;

public class P39 {
    public static void dfs(int sum,List<Integer> base,Set<List<Integer>> ans,int target,int[] candidates){
        if(sum>=target){
            if(sum==target){
                ArrayList<Integer> arrayList = new ArrayList<>(base);
                Collections.sort(arrayList);
                ans.add(arrayList);
            }
        }
        else {
            for (int candidate : candidates) {

//                dfs(sum,base,ans,target,candidates);

                sum += candidate;
                base.add(candidate);
                dfs(sum, base, ans, target, candidates);
                sum -= candidate;
                base.remove(base.size() - 1);

            }
        }
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        Set<List<Integer>> ans = new HashSet<>();
        dfs(0,new ArrayList<>(),ans,target,candidates);
        List<List<Integer>> ans_final = new ArrayList<>(ans);
        return ans_final;
    }

    public static void main(String[] args) {
        int[] candidates = {2,3,5};
        int target = 8;
        System.out.println(combinationSum(candidates, target));

    }
}
