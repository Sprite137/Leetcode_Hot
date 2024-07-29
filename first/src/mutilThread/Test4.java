package mutilThread;

public class Test4 extends Thread {

    static int n = 3;

     int id;

    static volatile int cur;

    public Test4(int id){
        this.id = id;
    }

    public void run(){
        while(cur<100){
            if( cur %3 == id ){
                synchronized (Test4.class){

                    cur++;

                    if(cur>100){
                        break;
                    }
                    System.err.println(Thread.currentThread().getName()+"打印"+cur);
                }
            }

        }
    }

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        for(int i=0;i<n;i++){
            new Test4(i).start();
        }

    }
}
