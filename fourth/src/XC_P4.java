/**
 * @author sprite-pc
 * @description:
 * @date 2024/9/5 20:28
 */
import java.util.*;
public class XC_P4{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(),k = in.nextInt();
        long target = in.nextLong();
        long[] nums = new long[n];
        long[] pre = new long[n];
        long sum = 0L;
        for(int i = 0; i<n; i++){
            nums[i] = in.nextLong();
            pre[i] = sum;
            sum += nums[i];
        }
        long ans = 0;
        if(k == 1){
            for(long num :nums){
                if(num >= target){
                    ans += num-target;
                }
            }
            System.out.println(ans);
            return;
        }
        long[] sumKList = new long[n-k+1];
        for(int i = 0;i<n-k+1;i++){
            sumKList[i] = pre[i+k-1]-pre[i]+nums[i+k-1];
        }
        for(int i = 0;i<=n-k;i++){
            int index = i+k-1;
            while(sumKList[i] > target){
                for(int j = index;j>=0;j--){
                    if(sumKList[i] <= target){
                        break;
                    }
                    long incr = 0;
                    if(sumKList[i] - target <= nums[index]){
                        incr = sumKList[i] - target;
                    }
                    else {
                        incr = nums[index];
                    }
                    ans += incr;
                    for(int temp = i;temp<=j;temp++){
                        if(temp < sumKList.length){
                            sumKList[temp] = sumKList[temp] - incr;
                        }

                    }
                    index--;
                }
//
            }
        }
        System.out.println(ans);
        return;

    }
}
