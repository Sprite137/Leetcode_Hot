import java.util.ArrayList;

public class P4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums = new int[nums1.length+nums2.length];
        int index1 = 0,index2 = 0;
        for(int i=0;i<nums.length;i++){
            if(index1==nums1.length){
                nums[i] = nums2[index2++];
                continue;
            }
            if(index2 == nums2.length){
                nums[i] = nums1[index1++];
                continue;
            }
            if(nums1[index1] > nums2[index2]){
                nums[i] = nums2[index2++];
            }
            else {
                nums[i] = nums1[index1++];
            }
        }
        if(nums.length%2==0){
            return (double) (nums[nums.length / 2 - 1] + nums[nums.length / 2]) /2;
        }
        else {
            return nums[nums.length/2];
        }

    }
}
