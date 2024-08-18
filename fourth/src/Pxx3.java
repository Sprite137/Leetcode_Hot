import java.util.*;

/**
 * @author sprite-pc
 * @description:
 * @date 2024/8/17 11:11
 */
public class Pxx3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int a = in.nextInt();
        int[][] grid = new int[n+1][n+1];
        int[] visited = new int[n+1];
        Map<String, List<Integer>> map = new HashMap<>();
        while(m -- >0){
            int x = in.nextInt(),y = in.nextInt();
            String temp = Arrays.toString(new int[]{x,y});
            grid[x][y] = 1;
            List<Integer> temp2 = map.getOrDefault(temp,new ArrayList<>());
            temp2.add(in.nextInt());
            map.put(temp,temp2);
        }

        List<List<Integer>> lujing = new ArrayList<>();
        dfs(1,n,visited);
        for(List<Integer> list : lujing){

        }



    }

    public static void dfs(int start, int end, int[] visit){
        visit[start] =1;


    }
}
