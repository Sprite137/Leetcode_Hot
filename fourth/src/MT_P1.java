import java.util.Scanner;

/**
 * @author sprite-pc
 * @description:
 * @date 2024/8/24 10:11
 */
public class MT_P1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        long n = in.nextLong();
        long[][] nums = new long[(int) n][2];
        int index = 0;
        while(n -- >0){
            nums[index][0] = in.nextLong();
            nums[index++][1] = in.nextLong();
        }

        long ans = 0L;
        long max = Long.MIN_VALUE;
        index = 0;

        // 离垃圾站最远的，且离初始点的垃圾最先处理
        for(int i = 0; i< nums.length; i++){
            long[] temp = nums[i];
            if(Math.abs(temp[0]-a)+Math.abs(temp[1]-b) > max){
                index = i;
                max = Math.abs(a-temp[0])+Math.abs(b-temp[1])+Math.abs(c-temp[0])+Math.abs(d-temp[1]);
            }
        }

        for(int i = 0; i< nums.length; i++){
            long[] temp = nums[i];
            if(i != index){

                ans += (Math.abs(temp[0]-c)+Math.abs(temp[1]-d))*2;
            }
            else {
                ans += Math.abs(a-temp[0])+Math.abs(b-temp[1])+Math.abs(c-temp[0])+Math.abs(d-temp[1]);
            }

        }
        System.out.println(ans);
    }
}
