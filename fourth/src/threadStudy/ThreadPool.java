package threadStudy;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author sprite-pc
 * @description:
 * @date 2024/9/23 17:27
 */
public class ThreadPool {

    public static void main(String[] args) throws InterruptedException {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(4,10,10, TimeUnit.SECONDS,new ArrayBlockingQueue<>(100));

        for(int i = 0; i<100;i++){
            threadPoolExecutor.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            });
        }
        int index = 0;
        while(true){
            Thread.sleep(100);
            System.err.println(threadPoolExecutor.getActiveCount());
            index++;
            if(index == 50){
                threadPoolExecutor.setCorePoolSize(10);
            }
        }
    }
}
