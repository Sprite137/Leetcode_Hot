package threadStudy;

import org.omg.PortableServer.ThreadPolicy;

import java.util.Objects;
import java.util.concurrent.*;

/**
 * @author sprite-pc
 * @description:
 * @date 2024/9/6 22:06
 */
public class FutureThread {

    static class ReturnThread implements Callable{

        @Override
        public Object call() throws Exception {
            Thread.sleep(2000);
            System.err.println("RETURN");
            return "RETURN 1";
        }
    }

    static class NoReturnThread implements Runnable{

        @Override
        public void run() {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.err.println("NO RETURN");
        }
    }

    public static void main(String[] args) throws Exception {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(4,4,4, TimeUnit.SECONDS,new ArrayBlockingQueue<>(10));
        Future futureThread = threadPoolExecutor.submit(new ReturnThread());
        threadPoolExecutor.submit(new NoReturnThread());
        System.err.println(futureThread.get());


    }
}
