public class P42 {
    public static int trap(int[] height) {
        int[] pre = new int[height.length];
        int[] aft = new int[height.length];
        int preMax = 0,aftMax=0;
        for(int i=1;i< height.length;i++){
            preMax = Math.max(height[i],preMax);
            pre[i] = preMax;
        }
        for(int i=height.length-1;i>0;i--){
            aftMax = Math.max(height[i],aftMax);
            aft[i] = aftMax;
        }
        int ans = 0;
        for(int i=0;i<height.length;i++){
            ans+=Math.min(pre[i],aft[i])-height[i];
        }
        return ans;
    }
}
