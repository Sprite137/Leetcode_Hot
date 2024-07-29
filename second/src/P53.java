public class P53 {
    public int maxSubArray(int[] nums) {
        int[] pre = new int[nums.length+1];

        int sum = 0;
        for (int i=0; i<nums.length; i++){
            sum += nums[i];
            pre[i+1] = sum;
        }

        int max = Integer.MIN_VALUE;
        boolean flag = false;
        for(int num:nums){
            if(num>=0){
                flag = true;
                break;
            }
            else {
                if(num>max){
                    max = num;
                }
            }
        }

        if(!flag){
            return max;
        }

        int ans = nums[0];
        int min_pre = Integer.MAX_VALUE;
        for (int i=0; i<=nums.length; i++){
            if(min_pre > pre[i]){
                min_pre = pre[i];
            }
            ans = Math.max(pre[i] - min_pre,ans);
        }

        return ans;
    }

    public static void main(String[] args) {
        P53 p = new P53();
        System.err.println(p.maxSubArray(new int[]{-1,-2}));
    }

}
