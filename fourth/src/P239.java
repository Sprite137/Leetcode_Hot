
import java.util.*;

/**
 * @author sprite-pc
 * @description:
 * @date 2024/8/7 21:30
 */
public class P239 {
    // 暴力
//    public static int[] maxSlidingWindow(int[] nums, int k) {
//        int first = 0;
//        int second = 0;
//        int[] temp = new int[k];
//        int[] ans = new int[nums.length-k+1];
//        // 初始化
//        for(int i = 0; i<nums.length-k+1; i++){
//            ans[i] = nums[i];
//            for(int j = i; j<i+k; j++){
//                ans[i] = Math.max(ans[i],nums[j]);
//            }
//        }
//        return ans;
//
//    }
//    public static int[] maxSlidingWindow(int[] nums, int k) {
//        Deque<Integer> deque = new ArrayDeque<>();
//        int[] ans = new int[nums.length-k+1];
//
//        // 初始化
//        for(int i = 0;i<k;i++){
//            if(deque.isEmpty() || nums[i] >= deque.peekFirst()){
//                deque.addFirst(nums[i]);
//            }else {
//                while(!deque.isEmpty() && deque.peekLast() < nums[i]){
//
//                    deque.pollLast();
//                }
//                deque.addLast(nums[i]);
//            }
//        }
//
//        for(int i = 0;i<nums.length-k;i++){
//            ans[i] = deque.peekFirst();
//
//            // 删除
//            if(nums[i] == deque.peekFirst()){
//                deque.pollFirst();
//            }
////            else {
////                while(!deque.isEmpty() && deque.peekLast() < nums[i]){
////                    deque.pollLast();
////                }
////                deque.pollLast();
////            }
//
//            // 增加
////            if(deque.isEmpty() || nums[i+k] >= deque.peekFirst()){
////                deque.addFirst(nums[i+k]);
////            }
////            else {
////                while(!deque.isEmpty() && nums[i+k] > deque.peekLast()){
////                    deque.pollLast();
////                }
////                deque.addLast(nums[i+k]);
////            }
//                while(!deque.isEmpty() && nums[i+k] > deque.peekLast()){
//                    deque.pollLast();
//                }
//                deque.addLast(nums[i+k]);
//
//
//
//        }
//        ans[ans.length-1] = deque.peekFirst();
//        return ans;
//    }
//
//    public static int[] test(int[] nums, int k){
//        Deque<Integer> deque = new LinkedList<>();
//        int[] ans = new int[nums.length-k+1];
//        for(int i = 0;i<k;i++){
//            while (!deque.isEmpty() && nums[i] > deque.peekLast()){
//                deque.pollLast();
//            }
//            deque.add(nums[i]);
//        }
//
//        for(int i = 0; i<nums.length-k; i++){
//            ans[i] = deque.peekFirst();
//
//            // 删除滑出的数字：如果删除的不是最大的，不用管；如果是最大的，删除队列的头
//            if(nums[i] == deque.peekFirst()){
//                deque.pollFirst();
//            }
//
//            // 加入滑入的数字
//            while(!deque.isEmpty() && nums[i+k] > deque.peekLast()){
//                deque.pollLast();
//            }
//            deque.addLast(nums[i+k]);
//
//
//
//
//        }
//        ans[ans.length - 1] = deque.peekFirst();
//        return ans;
//    }
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int[] ans = new int[nums.length-k+1];
        Deque<Integer> deque = new LinkedList<>();
        for(int i = 0;i<k;i++){
            while(!deque.isEmpty() && nums[i] > deque.peekLast()){
                deque.pollLast();
            }
            deque.add(nums[i]);
        }

        for(int i = 0; i< nums.length-k;i++){
            ans[i] = deque.peekFirst();

            if(deque.peekFirst() == nums[i]){
                deque.pollFirst();
            }

            while(!deque.isEmpty() && deque.peekLast() < nums[i+k]){
                deque.pollLast();
            }
            deque.add(nums[i+k]);
        }
        ans[ans.length-1] = deque.peekFirst();
        return ans;

    }

    public static void main(String[] args) {
        System.err.println(Arrays.toString(maxSlidingWindow(new int[]{9,10,9,-7,-4,-8,2,-6}, 5)));
    }
}
