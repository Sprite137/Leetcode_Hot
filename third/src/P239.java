import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.concurrent.DelayQueue;

public class P239 {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> deque = new LinkedList<>();
        int[] ans = new int[nums.length-k+1];

        // 构建一个递减的双向队列：这样如果最大元素滑出，后一个就是第二大的
        for(int i = 0;i<k;i++){
            while (!deque.isEmpty() && nums[i] > deque.peekLast()){
                deque.pollLast();
            }
            deque.add(nums[i]);
        }
        ans[0] = deque.peekFirst();

        // 开始滑动窗口
        for(int i = k; i<nums.length; i++){

            // 删除滑出的数字：如果删除的不是最大的，不用管；如果是最大的，删除队列的头
            if(nums[i-k] == deque.peekFirst()){
                deque.pollFirst();
            }

            // 加入滑入的数字
            while(!deque.isEmpty() && nums[i] > deque.peekLast()){
                deque.pollLast();
            }
            deque.add(nums[i]);



            ans[i-k+1] = deque.peekFirst();
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 1;
        System.err.println(Arrays.toString(maxSlidingWindow(nums, k)));
    }
}
