import java.util.*;

public class P347 {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        Queue<Integer> queue = new PriorityQueue<>((l1,l2) ->{
            return map.get(l1)-map.get(l2);
        });
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(int num: map.keySet()){
            if(queue.size() < k){
                queue.add(num);
            }
            else {
                queue.add(num);
                queue.poll();
            }
        }
        int[] ans = new int[k];
        for(int i = 0;i<k;i++){
            ans[i] = queue.poll();
        }
        return ans;

    }
}
