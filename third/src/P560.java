public class P560 {
    public int subarraySum(int[] nums, int k) {
        int[] pre = new int[nums.length];
        int sum = 0;
        for(int i = 0;i<nums.length; i++){
            pre[i] = sum;
            sum += nums[i];
        }
        int ans = 0;
        for(int i = 0;i<nums.length;i++){
            for(int j = i; j<nums.length;j++){
                if(pre[j] - pre[i] + nums[j]== k){
                    ans++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        P560 x = new P560();
        System.err.println(x.subarraySum(new int[]{1, 1,1}, 2));
    }
}
