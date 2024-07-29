import java.util.*;

public class P207 {
    class Node{

        int val;
        Node next;

        public Node(int val){
            this.val = val;
        }

    }
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> graph = new HashMap<>();

        for(int i = 0;i <numCourses; i++){
            graph.put(i,new ArrayList<>());
        }

        int[] inDegrees = new int[numCourses];
        for(int[] ints: prerequisites){
            graph.get(ints[1]).add(ints[0]);
            inDegrees[ints[0]]++;
        }
        Queue<Integer> queue = new LinkedList<>();

        for(int i = 0;i<numCourses; i++){
            if(inDegrees[i] == 0){
                queue.add(i);
            }
        }

//        List<Integer> order
        int order = 0;
        while(!queue.isEmpty()){
            int course = queue.remove();
            order++;
            for(int next: graph.get(course)){
                inDegrees[next]--;
                if(inDegrees[next] == 0){
                    queue.add(next);
                }
            }
        }
        return order == numCourses;
    }

    public static void main(String[] args) {

    }
}
