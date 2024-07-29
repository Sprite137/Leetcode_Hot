import java.util.*;

public class P56 {
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0]-o2[0] != 0){
                    return o1[0]-o2[0];
                }
                else {
                    return o2[1]-o1[1];
                }

            }
        });
        Queue<int[]> queue = new LinkedList<>(Arrays.asList(intervals));
        Stack<int[]> ans_stack = new Stack<>();
        if(intervals.length==1){
            return intervals;
        }
        while(!queue.isEmpty()){
            if(ans_stack.isEmpty()){
                int[] x1=  queue.poll();
                int[] x2 = queue.poll();
                if(x1[1]>=x2[0]){
                    ans_stack.add(new int[]{x1[0], Math.max(x1[1],x2[1])});
                }
                else {
                    ans_stack.add(x1);
                    ans_stack.add(x2);
                }
            }
            else {
                int[] x1 = ans_stack.pop();
                int[] x2 = queue.poll();
                if(x1[1] >= x2[0]){
                    ans_stack.add(new int[]{x1[0],Math.max(x1[1],x2[1])});
                }
                else {
                    ans_stack.add(x1);
                    ans_stack.add(x2);
                }
            }
        }
        int[][] ans = new int[ans_stack.size()][2];
        int index=0;
        for(int[] a:ans_stack){
            ans[index++]=a;
        }
        return ans;

    }

    public static void main(String[] args) {
//        int[][] intervals = {{1,2},{2,2},{2,3},{3,3},{4,6},{5,7}};
//        System.out.println(Arrays.deepToString(merge(intervals)));
//        Integer b = 124;
//        Integer a = 124;x
//
//        System.err.println(a==b);
//        Arrays.sort();

    }
}
