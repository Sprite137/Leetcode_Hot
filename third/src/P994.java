import java.util.LinkedList;
import java.util.Queue;

public class P994 {
    boolean[][] visited = new boolean[11][11];
    Queue<int[]> queue = new LinkedList<>();
    int step = 0;

    int total = 0;
    public int orangesRotting(int[][] grid) {


        int sum=0;
        for(int i = 0;i<grid.length; i++){
            for(int j = 0;j<grid[0].length; j++){
                if(grid[i][j] == 2 && !visited[i][j]){
                    queue.add(new int[]{i,j});
                }
                if(grid[i][j] == 1){
                    sum++;
                }
            }
        }
        bfs(grid);

        return total == sum ? step:-1;



    }

    public void bfs(int[][] grid){
        int[][] dirs = new int[][]{{-1,0},{1,0},{0,-1},{0,1}};
        while (! queue.isEmpty()){
            int n = queue.size();
            for(int i = 0;i< n;i++){
                int[] temp = queue.poll();
                for (int[] dir: dirs){
                    int newX = temp[0]+dir[0];
                    int newY = temp[1]+dir[1];
                    if(newX >=0 && newX < grid.length && newY >=0 && newY < grid[0].length && !visited[newX][newY] && grid[newX][newY]==1){
                        queue.add(new int[]{newX,newY});
                        visited[newX][newY] = true;
                        total++;
                    }
                }
            }

            step++;
        }
    }

    public static void main(String[] args) {
        P994 x = new P994();
        System.err.println(x.orangesRotting(new int[][]{{2, 1, 1}, {1, 1, 0}, {0, 1, 1}}));
    }
}
