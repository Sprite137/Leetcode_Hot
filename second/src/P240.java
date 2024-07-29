public class P240 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int x = 0, y = matrix[0].length-1;
        while(x< matrix.length && y >=0){
            if(matrix[x][y] > target){
                y--;

            }
            else if(matrix[x][y] < target){
                x++;
            }
            else {
                return true;
            }
        }
        return false;
    }
}
