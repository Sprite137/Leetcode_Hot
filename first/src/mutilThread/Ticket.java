package mutilThread;

import java.util.List;

public class Ticket implements Runnable{
    private int ticket;

    final Object LOCK = new Object();

//    List

    Ticket(int val){
        this.ticket=val;
    }

    Ticket(){};

    public void getTicket(){
        synchronized (LOCK){
            if(ticket>0){
                ticket--;
                System.err.println(Thread.currentThread().getName()+"抢到了，目前还剩"+ticket+"张票");
            }
            else {
                return;
            }
        }
    }

    @Override
    public void run() {
        if(ticket>0){
            getTicket();
        }

//        String
    }
}
