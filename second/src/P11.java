public class P11 {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int ans = 0;

        while(left<right){
            int min = Math.min(height[left],height[right]);
            ans = Math.max(ans,min*(right-left));
            if(min == height[left]){
                left++;
            }
            else {
                right--;
            }
        }
        return ans;
    }
}
