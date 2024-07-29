package dongtaiProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LogProxy implements InvocationHandler {

    private MoveAble moveAble;

    LogProxy(MoveAble moveAble){
        this.moveAble = moveAble;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.err.println("moving before");
        Object invoke = method.invoke(moveAble,args);
        System.err.println("moving after");
        return invoke;
    }
}
