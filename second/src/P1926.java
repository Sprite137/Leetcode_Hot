import java.util.LinkedList;
import java.util.Queue;

public class P1926 {
    boolean[][] visited = new boolean[101][101];
    public int nearestExit(char[][] maze, int[] entrance) {

        return bfs(entrance[0],entrance[1],maze);
    }

    public int bfs(int x, int y,char[][] maze){
        int step = 0;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x,y});
        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
        int m = maze.length, n = maze[0].length;

        while(!queue.isEmpty()){

            int size = queue.size();
            step++;

            for(int i=0;i<size;i++){
                int[] a = queue.poll();
                maze[a[0]][a[1]] = '+';
                for(int[] dir: dirs){
                    int newX = a[0]+dir[0];
                    int newY = a[1]+dir[1];
                    if(newX>=0 && newX<m && newY>=0 && newY<n && maze[newX][newY]=='.'){
                        queue.add(new int[]{newX,newY});
                        maze[newX][newY] = '+';
                        if(newX==0 || newY ==0 || newX == m-1 || newY ==n-1){
                            return step;
                        }
                    }
                }
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        char[][] maze = {{'+','.','+','+','+','+','+'},{'+','.','+','.','.','.','+'},{'+','.','+','.','+','.','+'},{'+','.','.','.','+','.','+'},{'+','+','+','+','+','.','.'}};
        int[] x = {0,1};
        P1926 a = new P1926();
        System.err.println(a.nearestExit(maze, x));
    }
}
