package lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author sprite-pc
 * @description:
 * @date 2024/9/5 0:40
 */
public class DeadLock {
    static Lock lock1 = new ReentrantLock();
    static Lock lock2 = new ReentrantLock();
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    acquireLock1();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    acquireLock2();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        thread1.start();
        thread2.start();

    }

    public static void acquireLock1() throws InterruptedException {
        lock1.lock();
        Thread.sleep(100);
        lock2.lock();

        System.err.println("acquireLock1 end");
        lock2.unlock();
        lock1.unlock();
    }

    public static void acquireLock2() throws InterruptedException {
        lock2.lock();
        Thread.sleep(100);
        lock1.lock();

        System.err.println("acquireLock2 end");
        lock1.unlock();
        lock2.unlock();
    }
}
