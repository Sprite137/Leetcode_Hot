import java.util.LinkedList;
import java.util.Queue;

public class P225 {
    class MyStack {
        Queue<Integer> queueA = new LinkedList<>();

        Queue<Integer> queueB = new LinkedList<>();

        public MyStack() {

        }

        public void push(int x) {
            queueA.add(x);
        }

        public int pop() {
            while(queueA.size()!=1){
                queueB.add(queueA.poll());
            }
//            Queue<Integer> temp =queueA;
//            queueB = queueA;
            int ans = queueA.poll();
            queueA = queueB;
            queueB = new LinkedList<>();
            return ans;

        }

        public int top() {
            while(queueA.size()!=1){
                queueB.add(queueA.poll());
            }
//            Queue<Integer> temp =queueA;

            int ans = queueA.peek();
            queueB.add(queueA.poll());
            queueA = queueB;
            queueB = new LinkedList<>();
            return ans;
        }

        public boolean empty() {
            return queueB.isEmpty() && queueA.isEmpty();
        }
    }
}
