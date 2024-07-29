public class P42 {
    public int trap(int[] height) {
        int[] pre = new int[height.length];
        int max = 0;
        for(int i = 0; i< height.length; i++){
            max = Math.max(height[i],max);
            pre[i] = max;
        }
        int[] aft = new int[height.length];
        max = 0;
        for(int i = height.length-1; i>=0; i--){
            max = Math.max(height[i],max);
            aft[i] = max;

        }
        int ans = 0;
        for(int i = 0;i<height.length;i++){
            ans += Math.min(aft[i],pre[i])-height[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        P42 x = new P42();
        System.err.println(x.trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
    }
}
