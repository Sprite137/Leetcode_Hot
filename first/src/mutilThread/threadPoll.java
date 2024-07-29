package mutilThread;

import java.sql.Time;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.locks.AbstractQueuedLongSynchronizer;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;

public class threadPoll {

    public static void main(String[] args) throws InterruptedException {
        Ticket t = new Ticket(20);
        ThreadPoolExecutor.DiscardPolicy RejectedExecutionHandler = new ThreadPoolExecutor.DiscardPolicy();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(4, 10, 3, TimeUnit.SECONDS, new LinkedBlockingQueue<>(2),RejectedExecutionHandler);

        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(t);
            thread.start();

//            threadPoolExecutor.execute(thread);
//            System.err.println(threadPoolExecutor.getQueue());
        }
        Thread.sleep(4000);

        threadPoolExecutor.shutdown();

    }
}
