import java.util.Comparator;
import java.util.PriorityQueue;

public class P215 {
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int num:nums){
            if(queue.size()<k){
                queue.add(num);
            }
            else {
                queue.add(num);
                queue.poll();
            }
        }
//        System.err.println(queue);
        return queue.poll();
    }

    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        int k = 6;
        int kthLargest = findKthLargest(nums, k);
        System.err.println(kthLargest);
    }
}
