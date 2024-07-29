package proxy;

import sun.rmi.runtime.Log;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

class LogProxy implements InvocationHandler {
        public  Face face;


        public LogProxy(Face face){
            this.face = face;
        }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.err.println(1);
        Object invoke = (Test) invoke(face, method, args);
        System.err.println(2);
        return invoke;
    }
}