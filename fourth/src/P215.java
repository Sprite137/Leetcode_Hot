import java.util.PriorityQueue;

/**
 * @author sprite-pc
 * @description:
 * @date 2024/8/18 22:09
 */
public class P215 {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(k);
        for(int num:nums){
            priorityQueue.add(num);
            if(priorityQueue.size() >k){
                priorityQueue.poll();
            }
        }
        return priorityQueue.peek();
    }
}
