import java.util.PriorityQueue;
import java.util.Stack;

/**
 * @author: xuzhi
 * @date: 2024/8/17 16:40
 * @description:
 */

public class P155 {
    class MinStack {

        Stack<Integer> stack = new Stack<>();
//        int min = Integer.MIN_VALUE;
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        public MinStack() {

        }

        public void push(int val) {
            stack.push(val);
            priorityQueue.add(val);

        }

        public void pop() {
            int a = stack.pop();
            priorityQueue.remove(a);
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return priorityQueue.peek();
        }
    }
}
