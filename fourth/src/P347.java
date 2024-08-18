import java.util.*;

/**
 * @author sprite-pc
 * @description:
 * @date 2024/8/18 22:27
 */
public class P347 {
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return map.get(o1) - map.get(o2);
            }
        });
        for(int num :nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(int key: map.keySet()){
            queue.add(key);
            if(queue.size() > k){
                queue.poll();
            }
        }
        int[] ans = new int[k];
        int index = 0;
        for(int num :queue){
            ans[index++] = num;
        }
        return ans;


    }

    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        int[] nums = new int[]{1,2,4,5,6,1,2};
        for(int num : nums){
            queue.add(num);
        }
        while(!queue.isEmpty()){
            System.err.println(queue.poll());
        }
    }
}
