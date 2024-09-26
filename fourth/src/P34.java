import java.util.*;

/**
 * @author: xuzhi
 * @date: 2024/8/17 14:50
 * @description:
 */

public class P34 {
//    public static int[] searchRange(int[] nums, int target) {
//        int left = 0, right = nums.length-1;
//        int index = -1;
//        while(left <= right){
//            int mid = (left+right)/2;
//            if(nums[mid] >= target){
//                right = mid-1;
//                while(nums[right] == nums[right-1]){
//                    right--;
//                }
//            }
//            else if(nums[mid] < target){
//                left = mid+1;
//                while(nums[left] == nums[left+1]){
//                    left++;
//                }
//
//            }
//            else {
//                index = mid;
//                break;
//            }
//        }
//        if(index == -1){
//            return new int[]{-1,-1};
//        }
//        int[] ans = new int[2];
//        for(int i = index;i< nums.length; i++){
//            if(nums[i] == nums[index] && ( i == nums.length-1 || nums[i+1] != nums[index])){
//                ans[1] = i;
//            }
//        }
//        for(int i = index;i>=0; i--){
//            if(nums[i] == nums[index] && ( i ==0 || nums[i-1] != nums[index] )){
//                ans[0] = i;
//            }
//        }
//
//        return ans;
//    }
    public static int searchIndex(int[] nums, int target){
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (left+right)/ 2;
            if (nums[mid] < target) {
                left = mid + 1; // 范围缩小到 [mid+1, right]
            } else {
                right = mid - 1; // 范围缩小到 [left, mid-1]
            }
        }
        return left;
    }

//    public static void main(String[] args) {
//        System.err.println(Arrays.toString(searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8)));
//    }
    public static void main(String[] args){
//        Scanner in= new Scanner(System.in);
//        int t = in.nextInt();
//        StringBuilder res = new StringBuilder();
//        for(int i = 0; i< t;i++){
//            int n = in.nextInt(), k = in.nextInt(), x = in.nextInt();
//            List<Integer> list = new ArrayList<>();
//            while (n -- >0){
//                list.add(in.nextInt());
//            }
//
//            int ans = Integer.MAX_VALUE;
//            int sum = 0;
//            while(!list.isEmpty()){
//                // 删除整个
//                ans = Math.min(ans,getSmallest(list)*k+sum);
//                // 删除单个
//                sum += x;
//                list.remove(0);
//            }
//            ans = Math.min(sum,ans);
//            res.append(ans);
//            System.out.print(res+" ");
//        }
//        System.out.print(res);
        System.err.println(searchIndex(new int[]{1, 3, 4, 5},2));

    }


    public static int getSmallest(List<Integer> list){
        List<Integer> temp = new ArrayList<>(list);
        Collections.sort(temp);
        for(int i = 0;i<temp.size(); i++){
            if(temp.get(i) != i){
                return i;
            }
        }
        return temp.size();
    }
}
