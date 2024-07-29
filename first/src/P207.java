import java.util.*;

public class P207 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for(int i=0;i<numCourses;i++){
            graph.put(i,new ArrayList<>());
        }

        int[] inDegrees = new int[numCourses];

        for(int[] pre:prerequisites){
            graph.get(pre[1]).add(pre[0]);
            inDegrees[pre[0]]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(inDegrees[i]==0){
                queue.add(i);
            }
        }

        List<Integer> order = new ArrayList<>();
        while(!queue.isEmpty()){
            int course = queue.remove();
            order.add(course);
            for(int next: graph.get(course)){
                inDegrees[next]--;
                if(inDegrees[next]==0){
                    queue.add(next);
                }
            }
        }
        return order.size() == numCourses;


    }

    public static void main(String[] args) {

    }
}
