import java.util.ArrayList;
import java.util.List;

/**
 * @author: xuzhi
 * @date: 2024/8/10 17:24
 * @description:
 */

public class P54 {
    public static List<Integer> spiralOrder(int[][] matrix) {
        int left = 0, right = matrix[0].length-1;
        int top = 0, bottom = matrix.length-1;
        List<Integer> ans  = new ArrayList<>();
        while(true){
            // 1
            for(int j = left; j <= right; j++){
                ans.add(matrix[top][j]);
            }
            if(++top > bottom){
                break;
            }

            // 2
            for(int i = top; i <=bottom; i++){
                ans.add(matrix[i][right]);
            }
            if(--right < left){
                break;
            }

            // 3
            for(int j = right; j>=left;j--){
                ans.add(matrix[bottom][j]);
            }
            if(-- bottom < top){
                break;
            }

            // 4
            for(int i = bottom; i>= top; i--){
                ans.add(matrix[i][left]);
            }
            if(++left > right){
                break;
            }


        }

        return ans;
    }

    public static void main(String[] args) {
        System.err.println(spiralOrder(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
    }
}
