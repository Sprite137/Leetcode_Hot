import java.util.Stack;

public class P155 {
    class MinStack {
        Stack<Integer> stack;

        Stack<Integer> stackMin;

        public MinStack() {
            stack = new Stack<>();
            stackMin = new Stack<>();
        }

        public void push(int val) {
            stack.push(val);

            // 构建最小栈
            if(stackMin.isEmpty() ||  val <= stackMin.peek()){
                stackMin.push(val);
            }

        }

        public void pop() {
            int val = stack.pop();
            // 删除最小栈
            if(val == stackMin.peek()){
                stackMin.pop();
            }
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return stackMin.peek();
        }
    }
}
