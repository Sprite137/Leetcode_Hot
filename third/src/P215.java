import java.util.PriorityQueue;

public class P215 {
    public int findKthLargest(int[] nums, int k) {
        // 构建堆的实现：优先队列; 最小堆，最小的最先出列
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for(int num:nums){
            if(queue.size() <k){
                queue.add(num);
            }
            else {
                queue.add(num);
                queue.poll();
            }

        }
        return queue.peek();
    }

    public static void main(String[] args) {
        P215 x = new P215();
        System.err.println(x.findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2));
    }
}
