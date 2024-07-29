import java.util.ArrayList;
import java.util.List;

public class P54 {
    public static List<Integer> spiralOrder(int[][] matrix) {
        int left = 0, right =  matrix[0].length-1;
        int top = 0, bottom = matrix.length-1;
        List<Integer> ans = new ArrayList<>();

        while(left <= right && top <= bottom){

            for(int j=left; j<=right; j++){
                ans.add(matrix[top][j]);
            }

            top++;
            if(top >  bottom){
                break;
            }

            for(int i = top; i <= bottom; i++){
                ans.add(matrix[i][right]);
            }

            right--;
            if(left>right){
                break;
            }


            for (int j= right; j>=left; j--){
                ans.add(matrix[bottom][j]);
            }



            bottom--;
            if(top >  bottom){
                break;
            }

            for (int i = bottom; i>=top ;i--){
                ans.add(matrix[i][left]);
            }

            left++;
            if(left>right){
                break;
            }


        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] x = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        System.err.println(spiralOrder(x));
    }
}
