import java.security.PublicKey;

public class P200 {
    static boolean[][] visited = new boolean[5][5];

    public static void getArea(char[][] grid, int col, int row){
        visited[col][row] = true;
        int[][] dirs = {{0,1},{0,-1},{1,0},{-1,0}};
        for(int[] dir:dirs){
            int now_col = col+dir[0],now_row = row+dir[1];
            if( now_col>=0 && now_col < grid.length && now_row>=0 && now_row<grid[0].length && !visited[now_col][now_row] && grid[now_col][now_row] =='1'){
                getArea(grid,now_col,now_row);
            }
        }
    }
    public static int numIslands(char[][] grid) {
        int ans = 0;

        for(int i=0;i< grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1' && !visited[i][j]){
                    ans++;
                    getArea(grid,i,j);

                }

            }
        }
        return ans;
    }

    public static void main(String[] args) {
        char[][] grid = {
        {'1','1','0','0','0'},
        {'1','1','0','0','0'},
        {'0','0','1','0','0'},
        {'0','0','0','1','1'}};
        int i = numIslands(grid);
        System.err.println(i);
    }

}
