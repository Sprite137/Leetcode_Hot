package SameMethodInInterface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test implements L1{
    @Override
    public void sleep() {
        System.err.println("l1");
    }

    public static void main(String[] args) throws InterruptedException {
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i<100;i++){
            list.add(i);
        }
        Iterator<Integer> iter = list.iterator();
        while(iter.hasNext()){
            if(iter.next() %2 ==0){
                iter.remove();
            }
        }
        System.err.println(list);

    }
}
