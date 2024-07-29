import java.util.*;

public class P347 {
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        Queue<Integer> queue = new PriorityQueue<>((l1,l2) ->{
            return map.get(l1) - map.get(l2);
        });
//        Queue<Integer> queue = new PriorityQueue<>();

        for(int num:nums){
//            if(!queue.contains(num)){
//                map.put(num,map.getOrDefault(num,0)+1);
//                queue.add(num);
//            }
//            else {
//                map.put(num,map.get(num)+1);
//            }
//
//
//            if(queue.size() > k){
//                queue.poll();
//            }
            map.put(num, map.getOrDefault(num,0)+1);
        }
        for(int key: map.keySet()){
            queue.add(key);

            if(queue.size() >k){
                queue.poll();
            }
        }

        int[] ans = new int[k];
        int index = k-1;
        while(!queue.isEmpty()){
            ans[index--] = queue.poll();
        }
        return ans;

    }

    public static void main(String[] args) {
        System.err.println(Arrays.toString(topKFrequent(new int[]{3,1,3,1,3,2,1,3}, 2)));
    }
}
