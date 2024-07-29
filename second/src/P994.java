import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

public class P994 {

    boolean[][] visited = new boolean[11][11];
    Queue<int[]> queue = new LinkedList<>();

    int step = 0;
    int total = 0;
    public int orangesRotting(int[][] grid) {

        for(int i = 0;i <grid.length; i++){
            for (int j = 0;j<grid[0].length; j++){
                if(grid[i][j] ==2){
                    queue.add(new int[]{i,j});
                    visited[i][j] = true;

                }
                if(grid[i][j] == 1){
                    total++;
                }
            }
        }
        if(total==0){
            return 0;
        }

        bfs(grid);


        return total==0 ? step-1:-1;


    }


    public void bfs(int[][] grid){
        int[][] dirs = {{1, 0},{-1,0},{0,1},{0,-1}};

        while(!queue.isEmpty()){
            step++;
            int n = queue.size();
            for(int i=0;i<n;i++){
                int[] temp =queue.poll();
                for(int[] dir: dirs){
                    int newX = temp[0] + dir[0];
                    int newY= temp[1] + dir[1];
                    if(newX >=0 && newX < grid.length && newY >=0 && newY<grid[0].length && !visited[newX][newY] && grid[newX][newY] == 1){
                        queue.add(new int[]{newX, newY});
                        grid[newX][newY] = 2;
                        total--;
                        visited[newX][newY]  =true;
                    }
                }
            }
         }
    }

    public static void main(String[] args) {
        int[][]grid = {{2,1,1},{1,1,0},{0,1,1}};
        P994 p = new P994();
        p.orangesRotting(grid);
    }
}
