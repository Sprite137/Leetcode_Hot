import java.util.*;

/**
 * @author: P56
 * @date: 2024/8/8 10:39
 * @description:
 */

public class P56 {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        Stack<int[]> stack = new Stack<>();
        stack.add(intervals[0]);

        for(int i = 1; i< intervals.length; i++){
            if(stack.peek()[1] >= intervals[i][0]){
                int[] temp = stack.pop();
                stack.add(new int[]{temp[0], Math.max(intervals[i][1],temp[1])});
            }
            else {
                stack.add(intervals[i]);
            }
        }


        int[][] res = new int[stack.size()][2];
        int index = 0;
        for(int[] ints : stack){
            res[index++] = ints;
        }
        return  res;
    }

    public static void main(String[] args) {

    }
}
