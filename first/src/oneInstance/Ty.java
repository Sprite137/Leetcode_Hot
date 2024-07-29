package oneInstance;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class Ty implements Callable {


    @Override
    public Object call() throws Exception {
        System.err.println("123");
        return 123;
    }




}
