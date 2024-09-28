package threadStudy;

import java.util.concurrent.ThreadPoolExecutor;

public class JoinTest {
    static final Object object = new Object();


    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (object){
                    try {
                        object.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

                System.err.println("I am thread1");

            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {

                System.err.println("I am thread2");

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (object){
                    object.notify();
                }

            }
        });

        thread1.start();
//        thread1.join();
        thread2.start();
    }
}
