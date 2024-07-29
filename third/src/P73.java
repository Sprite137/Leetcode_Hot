import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class P73 {
    public void setZeroes(int[][] matrix) {
        Set<Integer> col_zero = new HashSet<>();
        Set<Integer> row_zero = new HashSet<>();
        for(int i = 0; i<matrix.length; i++){
            for( int j =0;j<matrix[0].length;j++){
                if(matrix[i][j] ==0){
                    col_zero.add(i);
                    row_zero.add(j);
                }
            }
        }
        for(int i = 0; i<matrix.length; i++){
            for( int j =0;j<matrix[0].length;j++){
                if(col_zero.contains(i) || row_zero.contains(j)){
                    matrix[i][j] = 0;
                }
            }
        }

    }
}
