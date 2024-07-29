import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class P841{
    Set<Integer> set = new HashSet<>();
    boolean[] visited = new boolean[1001];
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        set.addAll(rooms.get(0));
        for(int num:set){
            dfs(num,rooms);
        }
        for(int i=1;i<rooms.size();i++){
            if(!visited[i]){
                return false;
            }
        }
        return true;
    }

    public void dfs(int num,List<List<Integer>> rooms){
        visited[num] = true;
        for(int x: rooms.get(num)){
            if(!visited[x]){
                dfs(x,rooms);
            }
        }
    }
}
