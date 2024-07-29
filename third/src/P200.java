import java.util.LinkedList;
import java.util.Queue;

public class P200 {
    boolean[][] visited = new boolean[301][301];
    public int numIslands(char[][] grid) {
        int ans = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j< grid[0].length; j++){
                if(grid[i][j] == '1' && !visited[i][j]){
                    bfs(i,j,grid);
                    ans++;
                }
            }
        }
        return ans;

    }

    public void bfs(int i, int j, char[][] grid){
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{i,j});
        visited[i][j] = true;
        int[][] dirs = new int[][]{{-1,0},{1,0},{0,-1},{0,1}};
        while (! queue.isEmpty()){
            int[] temp = queue.poll();
            for (int[] dir: dirs){
                int newX = temp[0]+dir[0];
                int newY = temp[1]+dir[1];
                if(newX >=0 && newX < grid.length && newY >=0 && newY < grid[0].length && !visited[newX][newY] && grid[newX][newY]=='1'){
                    queue.add(new int[]{newX,newY});
                    visited[newX][newY] = true;
                }
            }
        }
    }
}
