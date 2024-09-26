/**
 * @author sprite-pc
 * @description:
 * @date 2024/8/7 21:08
 */
public class P560 {
//    public int subarraySum(int[] nums, int k) {
//        int[] pre = new int[nums.length];       // 1 2 3 ----- 0 1 3
//        int sum = 0;
//        int ans = 0;
//        for(int i = 0;i<nums.length; i++){
//            pre[i] = sum;
//            sum += nums[i];
//        }
//
//        for(int i = 0; i<nums.length; i++){
//            for(int j = i; j< nums.length; j++){
//                if(pre[j]-pre[i]+nums[j] == k){
//                    ans++;
//                }
//            }
//        }
//        return ans;
//    }
    public static int subarraySum(int[] nums, int k) {
        int ans = 0;
        int sum = 0;
        int left = 0;
        int right = 0;
        while(right != nums.length){
            if(sum < k){
                sum += nums[right++];
            }
            else if(sum > k){
                sum -= nums[left++];
            }
            else{
                ans++;
                sum -= nums[left++];
            }
        }
        while(left != right){
            if(sum ==k){
                ans ++;
            }
            sum -= nums[left++];
        }
        return ans;
    }

    public static void main(String[] args) {
        System.err.println(subarraySum(new int[]{1, 1, 1}, 2));
    }
}
