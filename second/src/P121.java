public class P121 {
    public int maxProfit(int[] prices) {
        int ans = 0;
        int min = Integer.MAX_VALUE;
        for(int i=0; i< prices.length; i++){
            if(min > prices[i]){
                min = prices[i];
            }
            ans = Math.max(ans,prices[i]-min);
        }

        return ans;
    }
}
