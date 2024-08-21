import com.sun.org.apache.xerces.internal.impl.dv.util.ByteListImpl;
import com.sun.org.apache.xerces.internal.impl.dv.xs.DoubleDV;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: xuzhi
 * @date: 2024/8/21 19:42
 * @description:
 */

public class P50 {
    public static double myPow(double x, int n) {
        if(n == 0 || x ==1D){
            return 1D;
        }
        if(n < 0 ){
            x = 1D/x;
        }
        List<Double> list  = new ArrayList<>();
        double ans = x;
        int absN = 0;
        if(n == Integer.MIN_VALUE){
            absN = Integer.MAX_VALUE;
        }
        else {
            absN = Math.abs(n);
        }

        while(absN != 1){
            if(absN % 2 !=0){
                list.add(ans);
            }
            absN = absN / 2;
            ans = ans * ans;
        }
        for(double d : list){
            ans  = ans *d;
        }
        return n == Integer.MIN_VALUE?ans/x : ans;
    }

    public static void main(String[] args) {
        System.err.println(myPow(2, -2147483648));
    }
}
