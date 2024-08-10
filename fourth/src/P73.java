import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: xuzhi
 * @date: 2024/8/10 14:31
 * @description:
 */

public class P73 {
    public void setZeroes(int[][] matrix) {
        List<Integer> cols = new ArrayList<>();
        List<Integer> rows = new ArrayList<>();
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
                if(matrix[i][j] ==0){
                    cols.add(i);
                    rows.add(j);
                }
            }
        }
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
                if(cols.contains(i) || rows.contains(j)){
                    matrix[i][j] = 0;
                }
            }
        }

    }
}
