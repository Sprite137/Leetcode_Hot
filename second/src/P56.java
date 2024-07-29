import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P56 {
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(i1,i2) ->{
            return i1[0]-i2[0];
        });

//        List<int[]> list = new ArrayList<>();
        int index = 0;
        int[][] ans = new int[intervals.length][2];
        ans[0] = intervals[0];
        for(int i = 1; i< intervals.length; i++){
            if (ans[index][1] >= intervals[i][0] ){
                ans[index][1] = Math.max(intervals[i][1],ans[index][1]);
            }
            else {
                ans[++index] = intervals[i];
            }
        }
        int[][] ansFin = new int[index+1][2];
        for(int i = 0; i<=index; i++){
            ansFin[i] = ans[i];
        }
        return ansFin;
    }

    public static void main(String[] args) {
        merge(new int[][]{{1,4},{2,3}});
    }
}
