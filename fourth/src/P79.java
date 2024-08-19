/**
 * @author sprite-pc
 * @description:
 * @date 2024/8/17 9:57
 */
public class P79 {
    boolean flag = false;
    boolean[][] visited = new boolean[10][10];
    public boolean exist(char[][] board, String word) {

        for(int i = 0;i<board.length; i++){
            for(int j = 0; j<board[0].length; j++){
                if(flag){
                    return true;
                }
                if(!visited[i][j] && board[i][j] == word.charAt(0)){
                    backTrack(i,j,board,word,0);
                    visited[i][j] = false;
                }
            }
        }
        return flag;
    }

    public void backTrack(int i, int j, char[][] board, String word, int index){
        index++;
        visited[i][j] = true;
        if(index == word.length()){
            flag = true;
            return;
        }


        int[][] dirs = new int[][]{{-1,0},{1,0},{0,1},{0,-1}};
        for(int[] dir : dirs){
            int newX = i + dir[0];
            int newY = j + dir[1];
            if(newX >=0 && newX < board.length && newY >=0 && newY < board[0].length && !visited[newX][newY] && word.charAt(index)==board[newX][newY]){
                visited[newX][newY] = true;
                backTrack(newX,newY,board,word,index);
                visited[newX][newY] = false;
            }
        }

    }

    public static void main(String[] args) {
        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        P79 x = new P79();
        System.err.println(x.exist(board, "ABCCED"));
    }
}
