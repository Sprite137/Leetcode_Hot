package threadLocalTest;


import java.util.concurrent.atomic.AtomicInteger;

public class Test {
    ThreadLocal<Integer> threadLocal = new ThreadLocal<>();
    class ThreadTask implements Runnable{
        private int id;

        public ThreadTask(int val){
            this.id = val;
        }


        @Override
        public void run() {
            threadLocal.set(id);
//            System.err.println(threadLocal.get());
        }
    }

    public void a() {
        threadLocal.set(100);
        for(int i=0;i<2;i++){
//            AtomicInteger a = new AtomicInteger();
//            a.incrementAndGet();
//            ThreadTask threadTask = ;
            Thread thread = new Thread(new ThreadTask(i));
            thread.start();

//            System.err.println(threadLocal.get());
        }
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.a();
    }
}
