import java.util.*;

/**
 * @author sprite-pc
 * @description:
 * @date 2024/8/22 19:38
 */
public class GD_P2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        String s = in.next();
        String[] split = s.split("]");

        Queue<Character> queue = new LinkedList<>();
        for(char ch : s.toCharArray()){
            if(ch == '1' || ch == '0'){
                queue.add(ch);
            }
        }
        int size = queue.size();
        char[][] grid = new char[split.length][size/ split.length];


        for(int i = 0;i< split.length; i++){
            for(int j = 0;j < (size/ split.length); j++){
                grid[i][j] = queue.poll();
            }
        }
        int ans = 0;
        boolean[][] visited = new boolean[split.length][size/ split.length];
        for(int i = 0;i< split.length; i++){
            for(int j = 0;j < (size/ split.length); j++){
                if(!visited[i][j] && grid[i][j] == '1'){
                    ans++;
                    dfs(i,j,grid,visited);
                }
            }
        }
        System.out.println(ans);
    }

    public static void dfs(int i, int j, char[][] grid, boolean[][] visited){
        visited[i][j] = true;
        int[][] dirs = new int[][]{{-1,0},{1,0},{0,1},{0,-1}};
        for(int[] dir :dirs){
            int newX = i+dir[0];
            int newY = j+dir[1];
            if(newX >=0 && newX < grid.length && newY >=0 && newY < grid[0].length && !visited[newX][newY] && grid[newX][newY] == '1'){
                dfs(newX,newY,grid,visited);
            }
        }
    }

}
