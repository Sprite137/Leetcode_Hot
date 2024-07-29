package proxy;

import org.omg.CORBA.SystemException;
import org.omg.CORBA.portable.InputStream;
import org.omg.CORBA.portable.InvokeHandler;
import org.omg.CORBA.portable.OutputStream;
import org.omg.CORBA.portable.ResponseHandler;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Test implements Face {
    public static void hello() throws InterruptedException {
        Thread.sleep(10000);
        System.err.println("hello");
    }

    public static void hey() throws InterruptedException {
        System.err.println("hey");
    }


    @Override
    public void move() {
        System.err.println("moving");
    }

    public static void main(String[] args) {
        Test test = new Test();

    }
}
