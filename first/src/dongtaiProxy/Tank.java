package dongtaiProxy;

import java.lang.reflect.Proxy;

public class Tank implements MoveAble{



    @Override
    public void move() {
        System.err.println("moving");
    }


    public static void main(String[] args) {
        Tank tank  = new Tank();
        MoveAble o = (MoveAble) Proxy.newProxyInstance(tank.getClass().getClassLoader(), new Class[]{MoveAble.class}, new LogProxy(tank));
        o.move();
    }
}
