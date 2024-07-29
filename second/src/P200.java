import java.util.LinkedList;
import java.util.Queue;

public class P200 {
    int ans = 0;
    boolean[][] visited = new boolean[301][301];
    public int numIslands(char[][] grid) {
        for(int i=0; i<grid.length; i++){
            for (int j = 0; j<grid[0].length;j++){
                if( grid[i][j] == '1'){
                    bfs(i,j,grid);
                }

            }
        }
        return ans;
    }

    public void bfs(int i, int j, char[][] grid){
        if(visited[i][j]==false){
            ans++;
        }
        visited[i][j] = true;
        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{i,j});
        while(!queue.isEmpty()){
            int n = queue.size();
            int[] temp = queue.poll();
            int x = temp[0], y = temp[1];
            for(int[] dir:dirs){
                int newX = x+dir[0], newY = y+dir[1];
                if(newX>=0 && newX<grid.length && newY>=0 && newY<grid[0].length && !visited[newX][newY] && grid[newX][newY]=='1'){
                    queue.add(new int[]{newX,newY});
                    visited[newX][newY] = true;
                }
            }
        }
    }
}
