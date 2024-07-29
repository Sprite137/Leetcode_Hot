public class P79 {
    boolean flag = false;

    public boolean exist(char[][] board, String word) {
        for(int i = 0;i<board.length; i++){
            for (int j = 0; j< board[0].length; j++){
                if(board[i][j] == word.charAt(0)){
                    boolean[][] visited = new boolean[7][7];
                    dfs(word,board,visited,i,j,new StringBuilder().append(board[i][j]),1);
                }
            }
        }
        return flag;

    }

    public void dfs(String word, char[][] board, boolean[][] visited, int i, int j,StringBuilder base, int index){
        if(base.length() == word.length()){
            flag = true;
        }
        else {
            visited[i][j] = true;
            int[][] dirs = {{1,0}, {-1,0},{0,1},{0,-1}};
            for(int[] dir: dirs){
                int newX = i + dir[0];
                int newY = j + dir[1];
                if(newX >= 0 && newX <board.length && newY >=0 && newY <board[0].length && !visited[newX][newY] && board[newX][newY] == word.charAt(index)){
                    base.append(board[newX][newY]);
                    visited[newX][newY] = true;
                    dfs(word,board,visited,newX, newY,base,index+1);
                    base.deleteCharAt(base.length()-1);
                    visited[newX][newY] = false;
                }
            }
        }

    }

    public static void main(String[] args) {
        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        P79 x = new P79();
        System.err.println(x.exist(board, "ABCESEEEFS"));
    }
}
