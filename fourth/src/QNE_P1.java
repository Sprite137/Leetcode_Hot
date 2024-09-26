/**
 * @author: xuzhi
 * @date: 2024/9/6 15:34
 * @description:
 */

import java.util.*;

public class QNE_P1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<String> list  = new ArrayList<>();
        HashMap<String,Integer> map = new HashMap<>();

        PriorityQueue<String> priorityQueue = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                int o1 = Integer.parseInt(s1);
                int o2 = Integer.parseInt(s2);

                if (o1 <= 0 && o2 > 0) {
                    return -1;
                } else if (o1 > 0 && o2 <= 0) {
                    return 1;
                } else {
                    if(s1.equals(s2)){
                        return 1;
                    }
                    int min = Math.min(s1.length(), s2.length());
                    for (int i = 0; i < min; i++) {
                        if (s1.charAt(i) - s2.charAt(i) > 0) {
                            return 1;
                        } else if (s1.charAt(i) - s2.charAt(i) < 0) {
                            return -1;
                        }
                    }
                    if(o1 > 0){
                        if(min == s1.length()){
                            return s2.charAt(min)-s2.charAt(0);
                        }
                        else {
                            return s1.charAt(min)-s2.charAt(0);
                        }
                    }
                    else {
                        if(min == s1.length()){
                            return -1;
                        }
                        else {
                            return 1;
                        }
                    }

                }
            }
        });

        for(int i =0; i<n; i++){
            String a = in.next();
            priorityQueue.add(a);

            map.put(a,map.getOrDefault(a,0)+1);

        }

        StringBuilder ans = new StringBuilder();
        while(!priorityQueue.isEmpty()){
            ans.append(priorityQueue.poll());
            ans.append(" ");
        }
        System.out.println(ans.substring(0,ans.length()-1));

//        13
//-21 -23 -20 -2 -1 -1 0 0 1 1 2 21 23

    }
}
