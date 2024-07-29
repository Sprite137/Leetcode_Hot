public class P55 {
    public boolean canJump(int[] nums) {
        boolean[] arrived = new boolean[nums.length];

        arrived[0] = true;
        for(int i=0;i< nums.length; i++){
            if(arrived[nums.length-1]){
                return true;
            }
            if(arrived[i]){
                for (int j=0; j<=nums[i]; j++){
                    if((i+j)<nums.length && !arrived[i+j]){
                        arrived[i+j] = true;
                    }
                }
            }
        }

        return arrived[nums.length-1];
    }

    public static void main(String[] args) {
        P55 x=  new P55();
        x.canJump(new int[]{2, 3, 1, 1, 4});
    }
}
