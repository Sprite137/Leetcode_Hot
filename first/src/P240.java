public class P240 {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int col = 0, row = matrix[0].length-1;
        while(true){
            if(target==matrix[col][row]){
                return true;
            }else if(target>matrix[col][row]){
                col++;
            }
            else {
                row--;
            }
            if(col==matrix.length || row ==-1){
                return false;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
//        int[][] matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target = 5;
        boolean b = searchMatrix(matrix, target);
        System.err.println(b);
    }
}
