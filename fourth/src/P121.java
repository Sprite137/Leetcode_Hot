/**
 * @author sprite-pc
 * @description:
 * @date 2024/8/18 23:14
 */
public class P121 {
    public int maxProfit(int[] prices) {
        int ans = 0;
        int min = Integer.MAX_VALUE;
        for(int num: prices){
            min = Math.min(min,num);
            ans = Math.max(ans,num-min);
        }
        return ans;
    }
}
