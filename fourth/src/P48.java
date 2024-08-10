/**
 * @author: xuzhi
 * @date: 2024/8/10 17:37
 * @description:
 */

public class P48 {
    public void rotate(int[][] matrix) {
        for(int i = 0;i<matrix.length/2;i++){
            int[] temp = matrix[matrix.length-1-i];
            matrix[matrix.length-1-i] = matrix[i];
            matrix[i] = temp;
        }

        for(int i = 0; i< matrix.length; i++){
            for(int j = i; j<matrix.length;j ++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}
