package jigntaiProxy;

public class LogProxy extends Tank{
    @Override
    public void move() {
        System.err.println("moving before");
        super.move();
        System.err.println("moving after");
    }
}
