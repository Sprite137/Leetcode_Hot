/**
 * @author: xuzhi
 * @date: 2024/8/10 17:41
 * @description:
 */

public class P240 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int col = 0, row = matrix[0].length-1;
        while(col < matrix.length && row >=0){
            if(matrix[col][row] == target){
                return true;
            }
            else if(matrix[col][row] > target){
                row--;
            }
            else {
                col++;
            }
        }
        return false;
    }
}
