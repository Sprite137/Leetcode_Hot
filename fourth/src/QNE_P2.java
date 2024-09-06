/**
 * @author: xuzhi
 * @date: 2024/9/6 17:03
 * @description:
 */
import java.util.*;

public class QNE_P2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        int n = in.nextInt();
        long m = in.nextLong();
        long[] nums = new long[n];
        long[] mulNum = new long[n];
        for(int i = 0;i<n;i++){
            nums[i] = in.nextLong();
        }
        for(int i = 0;i<n;i++){
            mulNum[i] = in.nextLong();
        }

        int index = 0;
        while(index <n){
            long[] tempNums = Arrays.copyOf(nums,index);
            long[] tempMulNum = Arrays.copyOf(mulNum,index);
            Arrays.sort(tempNums);
            Arrays.sort(tempMulNum);
            long sum = 0;
            for(int i = index-1;i>=0;i--){
                sum += tempNums[i] * tempMulNum[i];
                if(sum >= m){
                    System.out.println(index);
                    return;
                }
            }
            index++;
        }
        System.out.println(-1);


    }
}
