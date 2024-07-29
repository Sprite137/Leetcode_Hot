import java.util.ArrayList;
import java.util.List;

public class P54 {
    public static List<Integer> spiralOrder(int[][] matrix) {
        int top = 0,bot =matrix.length-1,left=0,right= matrix[0].length-1;
        ArrayList<Integer> ans = new ArrayList<>();
        while(true){
            for(int i=left;i<=right;i++){
                ans.add(matrix[top][i]);
            }
            if(++top > bot ){
                break;
            }

            for(int i= top;i<=bot;i++){
                ans.add(matrix[i][right]);
            }
            if(--right < left){
                break;
            }

            for(int i=right;i>=left;i--){
                ans.add(matrix[bot][i]);
            }

            if(--bot < top){
                break;
            }

            for(int i = bot;i>=top;i--){
                ans.add(matrix[i][left]);
            }

            if(++left > right){
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        List<Integer> list = spiralOrder(matrix);
        System.err.println(list);
    }
}
