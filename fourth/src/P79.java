/**
 * @author sprite-pc
 * @description:
 * @date 2024/8/17 9:57
 */
public class P79 {
    boolean flag = true;
    boolean[][] visited = new boolean[10][10];
    public boolean exist(char[][] board, String word) {

        for(int i = 0;i<board.length; i++){
            for(int j = 0; j<board[0].length; j++){
                if(visited[i][j] == false && board[i][j] == word.charAt(0)){
                    backTrack(i,j,board,word);
                }
            }
        }
        return flag;
    }

    public void backTrack(int i, int j, char[][] board, String word){

    }
}
