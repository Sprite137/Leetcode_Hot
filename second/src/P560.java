public class P560 {
    public int subarraySum(int[] nums, int k) {
        int ans = 0;
        int[] pre = new int[nums.length];
        int sum = 0;
        for(int i=0;i<nums.length; i++){
            sum += nums[i];
            pre[i] = sum;

        }
        for(int i=0; i<nums.length-1; i++){
            for(int j=i; j<nums.length; j++ ){
                if(pre[j]-pre[i] +nums[i] == k){
                    ans++;
                }
            }
        }
        return ans;
    }
}
