import java.util.PriorityQueue;

public class P076 {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for(int num:nums){
            queue.add(num);

            if(queue.size() > k){
                queue.poll();
            }
        }
        for(int i = 0;i<k-1;i++){
            queue.poll();
        }
        return queue.peek();
    }

    public static void main(String[] args) {
        P076 x = new P076();
        System.err.println(x.findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2));
    }
}
