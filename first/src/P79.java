import java.util.ArrayList;
import java.util.Arrays;

public class P79 {

    static boolean ans = false;
    public static void dfs(int col,int row,char[][] board, String word,StringBuilder s,boolean[][] visited){
        if(s.length()==word.length()){
            if(s.toString().equals(word)){
                ans = true;
            }
        }
        else {
            int[][] dirs = {{0,-1},{0,1},{1,0},{-1,0}};
            for(int[] dir:dirs){
                int i=dir[0],j = dir[1];
                if(col+i >=0 && col+i<board.length && row+j>=0 && row+j<board[0].length && !visited[col + i][row + j]){
//                    dfs(col+i,row+j,board,word,s,visited);
                    s.append(board[col+i][row+j]);
                    visited[col+i][row+j] = true;
                    dfs(col+i,row+j,board,word,s,visited);
                    s.deleteCharAt(s.length()-1);
                    visited[col+i][row+j] = false;
                }
            }

        }
    }
    public static boolean exist(char[][] board, String word) {
        if(board.length==1 && board[0].length==1){
            if(board[0][0]==word.charAt(0)){
                return true;
            }
            else {
                return false;
            }
        }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                    StringBuilder s = new StringBuilder();
                    s.append(board[i][j]);
                    boolean[][] booleans = new boolean[board.length][board[0].length];
                    booleans[i][j]=true;
                    dfs(i,j,board,word,s,booleans);
                }

            }
        }
//        ArrayList

//        dfs(0,0,board,word,new StringBuilder(board[0][0]),new boolean[board.length][board[0].length]);
        return ans;
    }

    public static void main(String[] args) {
        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
//        char[][] board = {{'a'}};
        String word = "ABCCED";
        System.out.println(exist(board, word));
    }
}
