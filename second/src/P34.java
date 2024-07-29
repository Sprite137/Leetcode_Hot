import java.util.Arrays;

public class P34 {
    public int[] searchRange(int[] nums, int target) {
        int start = lowerBound(nums, target); // 选择其中一种写法即可
        if (start == nums.length || nums[start] != target) {
            return new int[]{-1, -1}; // nums 中没有 target
        }
        // 如果 start 存在，那么 end 必定存在
        int end = lowerBound(nums, target + 1) - 1;
        return new int[]{start, end};
    }

    private int lowerBound(int[] nums, int target) {
        int left = 0, right = nums.length - 1; // 闭区间 [left, right]
        while (left <= right) { // 区间不为空
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1; // 范围缩小到 [mid+1, right]
            } else {
                right = mid - 1; // 范围缩小到 [left, mid-1]
            }
        }
        return left;
    }

    public static void main(String[] args) {
        P34 x = new P34();
        System.err.println(Arrays.toString(x.searchRange(new int[]{5,7,7,8,8,10}, 6)));
    }
}
