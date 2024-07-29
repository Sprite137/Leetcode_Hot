import java.util.*;

public class P347 {
    public static int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Map.Entry<Integer,Integer>> queue = new PriorityQueue<>(new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o1.getValue()- o2.getValue();
            }
        });

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
//            if(map.size()<k){
//                map
//            }
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(queue.size()<k){
                queue.add(entry);
            }
            else {
                queue.add(entry);
                queue.poll();
            }
        }
        int[] ans = new int[k];
        for(int i=0;i<k;i++){
            ans[i] = queue.poll().getKey();
        }
        for(int i=0;i<k/2;i++){
            int temp = ans[i];
            ans[i] =ans[k-i-1];
            ans[k-i-1] =temp;

        }
//        System.out.println(Arrays.toString(ans));
//        return null;
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int k = 3;
        System.out.println(Arrays.toString(topKFrequent(nums, k)));
    }
}
