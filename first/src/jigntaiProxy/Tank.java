package jigntaiProxy;

public class Tank implements MoveAble {
    public static void main(String[] args) {
        Tank tank = new Tank();
       new LogProxy().move();
    }

    @Override
    public void move() {
        System.err.println("I'm moving");
    }
}
