import java.util.Stack;

public class P232 {
    class MyQueue {
        Stack<Integer> stackA = new Stack<>();


        Stack<Integer> stackB = new Stack<>();

        public MyQueue() {

        }

        public void push(int x) {
            while(!stackB.isEmpty()){
                stackA.push(stackB.pop());
            }
            stackA.push(x);
        }

        public int pop() {
            while(!stackA.isEmpty()){
                stackB.push(stackA.pop());
            }
            return stackB.pop();
        }

        public int peek() {
            while(!stackA.isEmpty()){
                stackB.push(stackA.pop());
            }
            return stackB.peek();
        }

        public boolean empty() {
            return stackA.isEmpty() && stackB.isEmpty();
        }
    }
}
