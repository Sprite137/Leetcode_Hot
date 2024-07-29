public class P73 {
    public void setZeroes(int[][] matrix) {
        boolean[] x_zero = new boolean[matrix.length];
        boolean[] y_zero = new boolean[matrix[0].length];
        for (int i=0; i< matrix.length; i++){
            for (int j=0; j<matrix[0].length; j++){
                if(matrix[i][j]==0){
                    x_zero[i] = true;
                    y_zero[j] = true;
                }
            }
        }

        for (int i=0; i< matrix.length; i++){
            for (int j=0; j<matrix[0].length; j++){
                if(x_zero[i] || y_zero[j]){
                    matrix[i][j] =0;
                }
            }
        }
    }
}
