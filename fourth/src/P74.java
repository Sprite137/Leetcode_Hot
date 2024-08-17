/**
 * @author: xuzhi
 * @date: 2024/8/17 14:37
 * @description:
 */

public class P74 {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int col = 0;
        if(matrix[0][0] > target || matrix[matrix.length-1][matrix[0].length-1] < target){
            return false;
        }
        for(int i = 0;i<matrix.length; i++){
            if(matrix[i][0] < target && (i == matrix.length-1 || matrix[i+1][0] > target)){
                col  = i;
                break;
            }
        }

        int left = 0, right = matrix[0].length;
        while(left <= right){
            int mid = (left+right)/2;
            if(matrix[col][mid] > target){
                right = mid-1;
            } else if (matrix[col][mid] < target) {
                left = mid+1;
            }
            else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.err.println(searchMatrix(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}},3));
    }
}
