import java.util.ArrayList;
import java.util.List;

public class OOMTest {

    static class OOMObject {
    }

    public static void main(String[] args) throws InterruptedException {
        List<OOMObject> list = new ArrayList<>();

        while(true) {
//            TimeUnit.MILLISECONDS.sleep(1);
            list.add(new OOMObject());
        }
    }
}
