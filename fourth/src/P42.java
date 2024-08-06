/**
 * @author sprite-pc
 * @description:
 * @date 2024/8/6 22:32
 */
public class P42 {
    public int trap(int[] height) {
        int[] pre = new int[height.length];
        int[] aft = new int[height.length];
        int temp = 0;
        for(int i = 0;i<height.length; i++){
            temp = Math.max(temp,height[i]);
            pre[i] = temp;
        }

        temp = 0;
        for(int i = height.length-1;i>=0; i--){
            temp = Math.max(temp,height[i]);
            aft[i] = temp;
        }

        int ans = 0;
        for(int i = 0; i<height.length; i++){
            ans += Math.min(pre[i],aft[i]) - height[i];
        }
        return ans;
    }
}
