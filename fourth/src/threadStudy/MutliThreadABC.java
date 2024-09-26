package threadStudy;

public class MutliThreadABC {
    static volatile int flag = 0;

    static class PrintThread implements Runnable{
        char ch;

        int yu;

        PrintThread(char ch,int yu){
            this.ch = ch;
            this.yu = yu;
        }


        @Override
        public void run() {
            while(flag <30){
                if(flag %3 == yu){
                    synchronized (PrintThread.class){
                        System.err.println(Thread.currentThread().getId()+"-"+ch);
                        flag++;
                    }
                }
            }

        }
    }

    public static void main(String[] args) {
        char[] chars = new char[]{'A','B','C'};
        for(int i = 0;i<3;i++){
            Thread thread = new Thread(new PrintThread(chars[i],i));
            thread.start();
        }
        while(true){
        }
    }

}
