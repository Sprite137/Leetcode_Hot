import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class P295 {
    class MedianFinder {
        Queue<Integer> A,B;

        public MedianFinder() {
            A = new PriorityQueue<>();      // 小顶堆
            B = new PriorityQueue<>( (l1,l2) ->{        // 大顶堆
                return l2-l1;
            } );
        }

        public void addNum(int num) {
            if(A.size() != B.size()){
                A.add(num);
                B.add(A.poll());
            }
            else {
                B.add(num);
                A.add(B.poll());
            }
        }

        public double findMedian() {
            if(A.size() != B.size()){
                return A.peek();
            }
            else {
                return (A.peek() + B.peek())/2.0;
            }
        }
    }
//class MedianFinder {
//    List<Integer> list;
//
//    public MedianFinder() {
//        list = new ArrayList<>();
//    }
//
//    public void addNum(int num) {
//        list.add(num);
//    }
//
//    public double findMedian() {
//        if(list.size() % 2 != 0){
//            return list.get(list.size()/2);
//        }
//        else {
//            return (list.get(list.size()/2-1)+list.get(list.size()/2))/2.0;
//        }
//    }
//}
}
