import java.util.PriorityQueue;
import java.util.Queue;

public class P215 {
    public static int findKthLargest(int[] nums, int k) {
        Queue<Integer> queue = new PriorityQueue<>((o1,o2) ->{
            return o2-o1;
        });
        for(int num: nums){
            queue.add(num);
            if(queue.size() > nums.length-k+1){
                queue.poll();
            }
        }

        return queue.peek();
    }

    public static void main(String[] args) {
        System.err.println(findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 6));
    }
}
