/**
 * @author sprite-pc
 * @description:
 * @date 2024/8/14 8:53
 */
public class P200 {
    boolean[][] visited = new boolean[301][301];
    int ans = 0;
    public int numIslands(char[][] grid) {
        int col = grid.length, row= grid[0].length;
        for(int i = 0; i < col ; i++){
            for(int j = 0; j< row; j++){
                if(!visited[i][j] && grid[i][j] == '1'){
                    bfs(grid, i ,j);
                    ans++;
                }
            }
        }
        return ans;
    }

    public void bfs(char[][] grid, int i, int j){
        visited[i][j] = true;
        int[][] dirs = new int[][]{{-1,0},{1,0},{0,1},{0,-1}};
        int col = grid.length, row= grid[0].length;
        for(int[] dir : dirs){
            int newI = i + dir[0],newJ = j + dir[1];
            if(newI < col && newI >=0 && newJ <row &&  newJ >=0 && !visited[newI][newJ] && grid[newI][newJ] == '1'){
                bfs(grid,newI,newJ);
            }
        }
    }
}
