public class P53 {

//     public int maxSubArray(int[] nums) {
//        int[] pre = new int[nums.length];
//
//        int sum = 0;
//        int max = Integer.MIN_VALUE;
//        for (int i=0; i<nums.length; i++){
//            pre[i] = sum;
//            max  = Math.max(max,nums[i]);
//            sum += nums[i];
//        }
//        if(max <= 0){
//            return max;
//        }
//
//        int ans = Integer.MIN_VALUE;
//        int min = Integer.MAX_VALUE;
//        for(int i = 0;i<nums.length;i++){
//            min = Math.min(pre[i],min);
//            ans = Math.max(pre[i]-min+nums[i],ans);
//        }
//
//        return ans;
//    }

    public int maxSubArray(int[] nums) {
        int[] pre = new int[nums.length];
        int sum = 0;
        int index = 0;
        for(int num:nums){
            pre[index++] = sum;
            sum += num;
        }

        // 买卖股票的逻辑
        int min = Integer.MAX_VALUE;
        int ans = Integer.MIN_VALUE;
        for(int i = 0;i<nums.length;i++){
            min = Math.min(min,pre[i]);
            ans = Math.max(ans,pre[i]-min+nums[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        P53 x= new P53();
        System.err.println(x.maxSubArray(new int[]{1,2,3,-10}));
    }
}
