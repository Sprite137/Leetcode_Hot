import java.util.*;

public class P239 {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> queue = new LinkedList<>();
        for(int i=0;i<k-1;i++){
            while(!queue.isEmpty() && nums[i] > queue.peekLast()){
                queue.pollLast();
            }
            queue.add(nums[i]);
        }
        int[] ans = new int[nums.length-k+1];
        for(int i=0; i<nums.length-k+1; i++){
            if(i!=0){
                if(nums[i-1] == queue.peek()){
                    queue.pollFirst();
                }
            }
            while(!queue.isEmpty() && nums[i+k-1] > queue.peekLast()){
                queue.pollLast();
            }

            queue.add(nums[i+k-1]);

            ans[i] = queue.peekFirst();
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        System.err.println(Arrays.toString(maxSlidingWindow(nums, k)));
    }
}
