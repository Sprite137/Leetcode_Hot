import java.util.concurrent.locks.AbstractQueuedLongSynchronizer;
import java.util.concurrent.locks.ReentrantLock;

public class P11 {
    public static int maxArea(int[] height) {
        int max = Integer.MIN_VALUE;
        int left=0,right = height.length-1;
        while(left<=right){
            int h = Math.min(height[left],height[right]);
            max = Math.max(max,h*(right-left));
            if(h==height[left]){
                left++;
            }else {
                right--;
            }
        }
        return max;
    }
//    AbstractQueuedLongSynchronizer
//    ReentrantLock
}
