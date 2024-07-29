import java.util.*;

public class P128 {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new TreeSet<>();
        for(int num:nums){
            set.add(num);
        }
//        Arrays.sort(nums);
        ArrayList<Integer> list = new ArrayList<>(set);
        int ans = 0;
        for(int i=0; i<list.size();){
            int temp = 1;
            int j = i+1;
            while( j < list.size() && list.get(j) == list.get(j-1)+1){
                if(list.get(j) == list.get(j-1)+1){
                    temp++;
                }

                j++;
            }
            ans = Math.max(temp,ans);
            i = j;
        }
        return ans;
    }

    public static void main(String[] args) {
        P128 x = new P128();
        int[] nums = {0,1,2,1};
        System.err.println(x.longestConsecutive(nums));
    }
}
