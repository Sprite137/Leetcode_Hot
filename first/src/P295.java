import java.util.*;

public class P295 {
    static class MedianFinder {

        ArrayList<Integer> list = new ArrayList<>();

//        HashMap<Integer,Integer> map = new HashMap<>();
        PriorityQueue<Integer> queue = new PriorityQueue<>();


        public MedianFinder() {

        }

        public void addNum(int num) {
            queue.offer(num);
        }

        public double findMedian() {
            if(queue.isEmpty()){
                return 0d;
            }
            if(queue.size()%2==0){
                Queue<Integer> temp = new PriorityQueue<>(queue);
                int end = 0;
                for(int i=0;i<queue.size()/2;i++){
                    if (i==queue.size()/2-1){
                        end = temp.peek();
                    }
                    temp.poll();
                }
                return (double) (end+temp.peek())/2d;
            }
            else {
                Queue<Integer> temp = new PriorityQueue<>(queue);
                for(int i=0;i<queue.size()/2;i++){
                    temp.poll();
                }
                return (double) temp.peek();
            }
        }
    }

    public static void main(String[] args) {
        MedianFinder x = new MedianFinder();

//        System.err.println(x.findMedian());
        x.addNum(1);
//        System.err.println(x.findMedian());
        x.addNum(2);
//        System.err.println(x.findMedian());
        x.addNum(3);
        x.addNum(-1);
        System.err.println(x.findMedian());

    }
}
