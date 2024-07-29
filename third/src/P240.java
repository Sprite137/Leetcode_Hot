public class P240 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int x = 0;
        int y = matrix[0].length-1;
        while( x< matrix.length && y >=0){
            if(matrix[x][y] > target){
                y--;
            }
            else if(matrix[x][y] == target){
                return true;
            }
            else {
                x++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        P240 x = new P240();
//        x.searchMatrix(new int[][]{})
    }
}
