package mutilThread;

public class PrintNumber implements Runnable{
    private volatile int number;

    final Object LOCK = new Object();

    public void setNumber(int val){
        this.number = val;
    }

    public int getNumber(){
        return this.number;
    }
    @Override
    public void run() {
        synchronized (LOCK){
            if(this.number<=10){
                System.err.println(Thread.currentThread().getName());
                System.err.println(this.number++);
            }

        }
    }
}
