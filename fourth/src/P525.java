public class P525 {
    public static int findMaxLength(int[] nums) {
        int[] pre = new int[nums.length];
        int sum = 0;
        for(int i = 0; i< nums.length; i++){
            pre[i] = sum;
            sum += nums[i];
        }
        int ans = 0;
        for(int i = 0; i<nums.length;i++){
            for(int j = i+1; j< nums.length;j+=2){
                if(j - i +1 > ans){
                    if((pre[j] - pre[i] + nums[j]) == (j-i+1)/2){
                        ans = Math.max(ans,j-i+1);
                    }
                }

            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.err.println(findMaxLength(new int[]{1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, 0, 0, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1, 1, 1, 0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 0, 1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0, 1, 1}));
    }
}
