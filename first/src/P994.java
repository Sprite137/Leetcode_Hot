import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class P994 {

    static boolean[][] visited = new boolean[11][11];
    public static int orangesRotting(int[][] grid) {
        int ans=0;
        for(int i=0;i< grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2){
                    ans = Math.max(ans,getLongest(grid,i,j));
                }

            }
        }
        for(int i=0;i< grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    return -1;
                }
            }
        }
        return ans;
    }

    private static int getLongest(int[][] grid, int col, int row) {
        int ans = 0;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{col,row});
        int[][] dirs = {{0,1},{1,0},{0,-1},{-1,0}};
        visited[col][row] = true;
        while(!queue.isEmpty()){

            for(int i=0;i<queue.size();i++){
                int[] now = queue.poll();

                for(int[] dir:dirs){
                    int now_col = now[0]+dir[0], now_row = now[1]+dir[1];
                    if(now_row<grid[0].length && now_row>=0 && now_col>=0 && now_col<grid.length && !visited[now_col][now_row] && grid[now_col][now_row]==1){
                        queue.add(new int[]{now_col,now_row});
                        grid[now_col][now_row]=2;
                        visited[now_col][now_row]=true;
                    }

                }
                if(queue.isEmpty()){
                    return ans;
                }
            }
            ans++;

        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] grid = {{2,1,1},{1,1,0},{0,1,1}};
        int i = orangesRotting(grid);
        System.err.println(i);
    }
}
