import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author sprite-pc
 * @description:
 * @date 2024/9/8 21:01
 */
public class QuickSort {
    public static void main(String[] args) throws InterruptedException {
//        int[] nums = new int[]{1,2,4,2,1,4,5,9,7,5,4,3,45,10};
//        quickSort(nums,0,nums.length-1);
//        System.err.println(Arrays.toString(nums));
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
        Thread thread = new Thread(() -> {
            list.add(1);
            System.err.println("thread update");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread thread1 = new Thread(() -> {
            list.add(1);
            System.err.println("thread1 update");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        thread.start();
        Thread.sleep(1000);
        thread1.start();
        while(true){
            System.err.println(list.size());
        }


    }

    public static void quickSort(int[] nums, int start, int end){
        if(start < end){
            int left = start;
            int right = end;
            int base = nums[start];
            while(left < right){
                while(left < right && nums[right] >= base){
                    right--;
                }
                nums[right] = nums[left];
                while(left < right && nums[left] <= base){
                    left++;
                }
                nums[left] = nums[right];
            }
            nums[left] = base;
            quickSort(nums,start,left-1);
            quickSort(nums, left+1,end);
        }
    }

//    public static void quickSort(int[] nums, int start, int end){
//        if(start < end){
//            int left  = start;
//            int right = end;
//            int base = nums[start];
//
//            while(left <right){
//                while(left < right && nums[right] >= base){
//                    right--;
//                }
//                nums[left] = nums[right];
//                while(left < right && nums[left] <= base){
//                    left++;
//                }
//                nums[right] = nums[left];
//            }
//            nums[left] = base;
//            quickSort(nums,start,left-1);
//            quickSort(nums,left+1,end);
//        }
//    }
}
