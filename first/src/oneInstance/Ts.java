package oneInstance;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Ts {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Ty ty = new Ty();
        FutureTask<Integer> result = new FutureTask<Integer>(ty);
        Thread thread = new Thread(result);
//        thread.start();
        System.err.println(result.get());

    }
}
