package voli;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/**
 * @author sprite-pc
 */
public class Test {
    static int a;
    static final Object LOCK = new Object();

    public static void main(String[] args) throws InterruptedException {


//        new Thread(() ->{
//            synchronized (LOCK){
//                System.err.println("---thread1---sleep before---");
//                try {
//                    LOCK.wait(2000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//                System.err.println("---thread1---sleep after---");
//
//            }
//
//            // sleep
//
//        }).start();
//
//
//        new Thread(() ->{
//            synchronized (LOCK){
//                System.err.println("---thread2---sleep before---");
//                try {
//                    Thread.sleep(2000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//                System.err.println("---thread2---sleep after---");
//
//                LOCK.notify();
//            }
//
//
//        }).start();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5,10,20, TimeUnit.SECONDS,new LinkedBlockingDeque<>(10));
        threadPoolExecutor.execute(new Thread(()->{
            System.err.println("100");
        }));
        System.err.println(threadPoolExecutor.getActiveCount());
//        Thread.sleep(1);
        System.err.println(threadPoolExecutor.getCompletedTaskCount());
        System.err.println(threadPoolExecutor.getQueue());

    }
}
