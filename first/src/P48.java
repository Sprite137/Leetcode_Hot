import java.util.Arrays;

public class P48 {
    public static void rotate(int[][] matrix) {
        // 上下反转
        for (int i=0; i<matrix.length/2; i++){
            int[] temp = Arrays.stream(matrix[i]).toArray();
            for (int j=0; j<temp.length; j++){
                matrix[i][j] = matrix[matrix.length-i-1][j];
            }
            matrix[matrix.length-i-1] = temp;
        }

        // 对角线反转
        for(int i=0; i<matrix.length; i++){
            for (int j=i; j<matrix.length; j++){
                int temp  = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[][] nums = {{1,2},{3,4}};
        rotate(nums);
    }




}
