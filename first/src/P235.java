import java.util.Arrays;

public class P235 {

    public static int[] maxSlidingWindow(int[] nums, int k) {
        if(k==1){
            return nums;
        }
        int[] ans = new int[nums.length-k+1];
        int index_ans =0, max = Integer.MIN_VALUE,index=0;
        for(int i=0;i<= nums.length-k;i++){
            if(i!=0 && i==index){
                max = Integer.MIN_VALUE;
                for(int j=i;j<i+k;j++){
                    if(nums[j]>max){
                        max = nums[j];
                    }
                }
            }
            int new_int = nums[i+k-1];
            if(new_int<=max){           // 新加入的小
                if(new_int==max){
                    index=i;
                }
                ans[index_ans++] = max;
            }
            else {              //新加入的大
                if(i==0){
                    for(int j=i;j<i+k;j++){
                        if(nums[j]>max){
                            max = nums[j];
                            index=j;
                        }
                    }
                    ans[index_ans++] = nums[index];
                }
                else {
                    ans[index_ans++] = new_int;
                    max = new_int;
                    index=i;
                }

            }

        }
        return ans;
    }

    public static void main(String[] args) {
       int[] nums = {1,3,-1,-3,5,3,6,7};
       int k = 3;
        int[] ints = maxSlidingWindow(nums, k);
        System.err.println(Arrays.toString(ints));
    }
}
