import java.util.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> list = new ArrayList<>();
        LinkedList<Integer> listLink = new LinkedList<>();

//        System.err.println(bef);
        for(int i=0;i<100000000;i++){
            listLink.add(i);
        }
        System.err.println(1);
        long bef = new Date().getTime();
        for(int i=100000000-1;i>=10;i--){
            listLink.remove(i);
        }
        Thread.sleep(1000);
//


        long end = new Date().getTime();
        System.err.println(end-bef);

    }
}