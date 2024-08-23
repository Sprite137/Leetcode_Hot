import java.util.Arrays;
import java.util.Scanner;

/**
 * @author sprite-pc
 * @description:
 * @date 2024/8/22 19:07
 */
public class GD_P1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] split = s.split(",");
        int[] nums = new int[split.length];
        if(nums.length < 3){
            System.out.println(0);
            return;
        }

        for (int i = 0; i < split.length; i++) {
            if (i == 0) {
                nums[i] = Integer.parseInt(split[i].substring(1));
            } else if (i == split.length - 1) {
                nums[i] = Integer.parseInt(split[i].substring(0, split[i].length() - 1));
            } else {
                nums[i] = Integer.parseInt(split[i]);
            }

        }
        boolean isAll = true;
        for (int i = 0 ; i < nums.length - 1; i++) {
            if (nums[i] != nums[i+1]) {
                isAll = false;
                break;
            }
        }
        if (isAll) {
            System.out.println(3);
            return;
        }
        int[] dp = new int[nums.length];
        dp[0] = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                dp[i] = 1;
            } else {
                dp[i] = 0;
            }
        }
        int ans = 0;
        for (int i = 0; i < dp.length; i++) {
            if (dp[i] == 1) {
                // 将遇到的第一个0置1
                int index0 = 0;
                for (int j = i; j < dp.length; j++) {
                    if (dp[j] == 0) {
                        dp[j] = 1;
                        index0 = j;
                        break;
                    }
                }
                ans = Math.max(ans, find(dp, i));
                dp[index0] = 0;


            }
            if(dp[i] == 0){
//                //将遇到的第一个1置0
//                int index1 = 0;
//                boolean flag = true;
//                for (int j = i; j < dp.length; j++) {
//                    if (dp[j] == 0) {
//                        flag = false;
//                    }
//                    if (!flag && dp[j] == 1) {
//                        dp[j] = 0;
//                        index1 = j;
//                        break;
//                    }
//                }
                dp[i] = 1;
                ans = Math.max(ans, find(dp, i));
                dp[i] = 0;
            }
        }
        System.out.println(ans);
    }

    public static int find(int[] nums, int start) {
        boolean flag = true;
        int index = 0;
        for (int i = start; i < nums.length; i++) {
            if (nums[i] == 0) {
                flag = false;
            }
            if (!flag && nums[i] == 1) {
                index = i;
                break;
            }
        }
        if (index == 0) {
            return nums.length - start >= 3 ?  nums.length - start : 0;
        }
        return index - start + 1 >= 3 ?  index - start + 1 : 0;
    }
}
