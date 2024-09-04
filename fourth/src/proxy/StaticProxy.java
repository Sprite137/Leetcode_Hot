package proxy;

/**
 * @author sprite-pc
 * @description:
 * @date 2024/8/28 22:48
 */
public class StaticProxy {
    class Tank{
        public void move(){
            System.err.println("moving");
        }

        public void main(String[] args) {
            new ProxyTank().move();
        }
    }

    class ProxyTank extends Tank{
        @Override
        public void move() {
            System.err.println("before moving");
            super.move();
            System.err.println("after moving");
        }
    }
}
