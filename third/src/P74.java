import java.time.OffsetDateTime;

public class P74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int col = 0, row = matrix[0].length-1;
        while(col < matrix.length && row >=0){
            if(matrix[col][row] < target){
                col++;
            }
            else if(matrix[col][row] == target){
                return true;
            }
            else {
                row--;
            }
        }
        return false;

    }
}
