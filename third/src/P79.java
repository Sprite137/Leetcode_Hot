/**
 * @author :xuzhi
 * @data:2024/7/9
 */

public class P79 {
    boolean flag = false;
    public boolean exist(char[][] board, String word) {
        for(int i = 0; i<board.length; i++){
            for(int j = 0; j< board[0].length; j++){
                if(board[i][j] == word.charAt(0) && ! flag){
                    dfs(board,i,j,word,1, new boolean[board.length][board[0].length]);
                }
            }
        }
        return flag;

    }

    public void dfs(char[][] board, int i, int j, String word,int length, boolean[][] visited){
        if(length == word.length()){
            flag = true;
            return;
        }
        if(!visited[i][j]){
            int[][] dirs = {{-1,0},{1,0},{0,1},{0,-1}};
            visited[i][j] = true;
            for(int[] dir: dirs){
                if(i+dir[0] >=0 && i+dir[0] < board.length && j+dir[1]>=0 && j+dir[1] < board[0].length){
                    if(board[i+dir[0]][j+dir[1]] == word.charAt(length) && !visited[i+dir[0]][j+dir[1]]){
                        dfs(board,i+dir[0], j+dir[1],word,length+1, visited);
                    }

                }

            }
            visited[i][j] = false;
        }

    }

    public static void main(String[] args) {
        char[][] board = {{'A','B','C','E'},{'S','F','E','S'},{'A','D','E','E'}};
        P79 x = new P79();
        System.err.println(x.exist(board, "ABCESEEEFSE"));
    }
}
