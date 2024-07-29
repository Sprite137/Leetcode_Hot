public class P121 {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int ans = 0;
        for(int num:prices){
            min = Math.min(num,min);
            ans = Math.max(ans,num-min);
        }
        return ans;

    }
}
