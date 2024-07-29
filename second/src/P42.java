public class P42 {
    public int trap(int[] height) {
        int ans = 0;
        int[] left_list = new int[height.length];
        int max_left = 0;
        for(int i=0; i<height.length; i++){
            max_left = Math.max(max_left,height[i]);
            left_list[i] = max_left;
        }

        int[] right_list = new int[height.length];
        int max_right = 0;
        for(int i=height.length-1; i>=0; i--){
            max_right = Math.max(max_right,height[i]);
            right_list[i] = max_right;
        }

        for(int i=0;i<height.length; i++){
            ans += Math.min(left_list[i],right_list[i])-height[i];
        }
        return ans;
    }
}
