import java.util.LinkedList;
import java.util.Queue;

/**
 * @author sprite-pc
 * @description:
 * @date 2024/8/14 9:12
 */
public class P994 {
    public static int orangesRotting(int[][] grid) {
        int step = 0;
        int newOrange = 0;
        int col = grid.length, row= grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 2){
                    queue.add(new int[]{i,j});
                }
                else if(grid[i][j] == 1){
                    newOrange++;
                }
            }
        }
        if(newOrange == 0){
            return 0;
        }
        int[][] dirs = new int[][]{{-1,0},{1,0},{0,1},{0,-1}};
        while( !queue.isEmpty() && newOrange > 0){
            int size = queue.size();
            for(int i = 0; i<size ; i++){
                int[] temp = queue.poll();
                for(int[] dir : dirs){
                    int newI = temp[0] + dir[0],newJ = temp[1] + dir[1];
                    if(newI < col && newI >=0 && newJ <row &&  newJ >=0 && grid[newI][newJ] == 1){
                        newOrange--;
                        grid[newI][newJ] = 2;
                        queue.add(new int[]{newI,newJ});
                    }
                }
            }
            step++;
        }
        if(newOrange > 0){
            return -1;
        }
        return step;
    }

    public static void main(String[] args) {
        orangesRotting(new int[][]{{2,1,1},{0,1,1},{1,0,1}});
    }
}
