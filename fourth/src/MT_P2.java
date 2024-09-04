import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author sprite-pc
 * @description:
 * @date 2024/8/24 10:45
 */
public class MT_P2 {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        long a = in.nextLong();
//        long b = in.nextLong();
//        long c = in.nextLong();
//        long[] nums = new long[]{a,b,c};
//        long k = in.nextLong();
//        long ans = 0;
//        Arrays.sort(nums);
//
//        if(k <= nums[1]-nums[0]){
//            nums[0] += k;
//            ans = (long) ((nums[0]*nums[1]*nums[2]) % (1e9+7));
//            System.out.println(ans);
//            return;
//        }
//        k -= nums[1]-nums[0];
//        nums[0] = nums[1];
//
//        if(k <= 2*(nums[2]-nums[1])){
//            nums[1] += k/2;
//            if(k %2 ==0){
//                nums[0] += k/2 ;
//            }
//            else {
//                nums[0] += k/2+1;
//            }
//            ans = (long) ((nums[0]*nums[1]*nums[2]) % (Math.pow(10,9)+7L));
//            System.out.println(ans);
//            return;
//        }
//        else {
//            k -= (nums[2]-nums[1])*2;
//            nums[1] = nums[2];
//            nums[0] = nums[2];
//        }
//
//        nums[0] += k/3L;
//        nums[0] = (long) (nums[0] % (Math.pow(10,9)+7L));
//        if(k %3 ==0){
//            nums[1] += k/3L;
//            nums[1] = (long) (nums[1] % (Math.pow(10,9)+7L));
//            nums[2] += k/3L;
//            nums[2] = (long) (nums[2] % (Math.pow(10,9)+7L));
//        }
//        else if(k % 3 == 1){
//            nums[1] += k/3L+1L;
//            nums[1] = (long) (nums[1] % (Math.pow(10,9)+7L));
//            nums[2] += k/3L;
//            nums[2] = (long) (nums[2] % (Math.pow(10,9)+7L));
//        }
//        else {
//            nums[1] += k/3L+1L;
//            nums[1] = (long) (nums[1] % (Math.pow(10,9)+7L));
//            nums[2] += k/3L+1L;
//            nums[2] = (long) (nums[2] % (Math.pow(10,9)+7L));
//        }
//        ans = (long) ((nums[0]*nums[1]*nums[2]) % (Math.pow(10,9)+7L));
//        System.out.println(ans);
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i<10;i++){
            list.add(i);
        }
//        for(int i = 0;i<list.size(); i++){
////            list.add(i+100);
//            list.remove(i);
//        }
        Iterator<Integer> integerIterator = list.iterator();
        while(integerIterator.hasNext()){
            integerIterator.next();
            integerIterator.remove();

        }

//        List<Integer> collect = list.stream().filter(new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                return integer % 2 == 0;
//            }
//        }).collect(Collectors.toList());
        System.err.println(list);
    }
}
