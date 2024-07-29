import java.util.HashMap;
import java.util.LinkedHashMap;

public class P121 {
    public int maxProfit(int[] prices) {
        int cost = Integer.MAX_VALUE,ans = 0;
        for(int price:prices){
            cost =Math.min(cost,price);
            ans = Math.max(ans,price-cost);
        }

        return ans;


    }

    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(10,20);
        map.put(1,2);

        for(int v: map.values()){
            System.err.println(v);
        }
    }
}
