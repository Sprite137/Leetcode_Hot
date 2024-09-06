import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.Lock;

/**
 * @author: xuzhi
 * @date: 2024/8/29 11:25
 * @description:
 */

public class Test1 {
////    public int[][] solution(int[][] intervals) {
////        // 在这⾥写代码
////        Arrays.sort(intervals, new Comparator<int[]>() {
////            @Override
////            public int compare(int[] o1, int[] o2) {
////                return o1[0]-o2[0];
////            }
////        });
////        Stack<int[]> stack = new Stack<int[]>();
////        stack.add(intervals[0]);
////        for(int i=1; i<intervals.length; i++){
////            if(!stack.isEmpty() && stack.peek()[1] <= intervals[i][0]){
////                int[] temp = stack.pop();
////                stack.add(new int[]{temp[0],Math.max(temp[1],intervals[i][1])});
////            }else{
////                stack.add(intervals[i]);
////            }
////        }
////        int[][] ans = new int[stack.size()][2];
////        int index = 0;
////        for(int[] temp:stack){
////            ans[index++] = temp;
////        }
////        return ans;
//
//    }

//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        while(n-- >0){
//            String s = in.next();
//            if(s.isEmpty() || Character.isUpperCase(s.charAt(0)) || s.charAt(0) == '_' || s.charAt(s.length()-1) == '_'){
//                System.out.println("indistinct");
//                continue;
//            }
//            String[] s1 = s.split("_");
//            boolean flag = true;
//            for(String temp:s1){
//                if(temp.isEmpty() || Character.isUpperCase(temp.charAt(0))){
//                    System.out.println("indistinct");
//                    flag = false;
//                    break;
//                }
//            }
//            if(!flag){
//                continue;
//            }
//            List<Integer> indexes = new ArrayList<>();
//            for(int i = 0; i<s.length(); i++){
//                if(Character.isUpperCase(s.charAt(i))){
//                    indexes.add(i);
//                }
//            }
//            if(indexes.isEmpty()){
//                System.out.println(s);
//                continue;
//            }
//            if(s1.length >1 ){
//                System.out.println("indistinct");
//                continue;
//            }
//            StringBuilder ans = new StringBuilder();
//            ans.append(s, 0, indexes.get(0));
//            for(int i = 0;i<indexes.size(); i++){
//                String temp = "";
//                if(i == indexes.size()-1){
//                    temp = s.substring(indexes.get(i));
//                }
//                else {
//                    temp = s.substring(indexes.get(i),indexes.get(i+1));
//                }
//
//                String x = Character.toLowerCase(temp.charAt(0))+temp.substring(1);
//                ans.append("_");
//                ans.append(x);
//            }
//
//            System.out.println(ans);
//
//        }
//    }
//    static int ans = 0;
//    List<List<Integer>> list = new ArrayList<>();
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int[] nums = new int[n];
//        for(int i = 0; i<n; i++){
//            nums[i] = in.nextInt();
//        }
//        dfs(0,0,nums,n,new ArrayList<>());
//        System.out.println(ans);
//    }
//
//    public static void dfs(int index, int length,int[] nums, int n, List<Integer> base){
//        if(length == n){
//            if(isValid(base,nums)){
//                ans++;
//            }
//        }else {
//            for(int i = 0;i<nums.length; i++){
//                if(!base.contains(i)){
//                    base.add(i);
//                    dfs(0,length+1,nums,n,base);
//                    base.remove(base.size()-1);
//                }
//            }
//        }
//    }
//
//    public static boolean isValid(List<Integer> base, int[] nums){
//        for(int i = 0;i<nums.length-1; i++){
//            if(nums[base.get(i)] % nums[base.get(i+1)] != 0 && nums[base.get(i+1)] % nums[base.get(i)] != 0){
//                return false;
//            }
//        }
//        return true;
//    }
   public int maxK(int[] nums, int k) {
      // write code here
      PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
      for(int num : nums){
         priorityQueue.add(num);
         if(priorityQueue.size() > k){
            priorityQueue.poll();
         }
      }
      int ans = 0;
      for(int num : priorityQueue){
         ans += num;
      }
      return ans;
   }

   public static String mostFrequentSubstring(String s, int k) {
      // write code here
      HashMap<String,Integer> map = new HashMap<>();
      for(int i  = 0;i<=s.length()-k;i++){
         map.put(s.substring(i,i+k),map.getOrDefault(s.substring(i,i+k),0)+1);
      }
      List<String> list = new ArrayList<>();
      int max = Collections.max(map.values());
      for(String temp: map.keySet()){
         if(map.get(temp) == max){
            list.add(temp);
         }
      }
      String ans = list.get(0);
      for(String temp : list){
         if(ans.compareTo(temp) >=0){
            ans = temp;
         }
      }
      return ans;
   }


   public static void main(String[] args) throws InterruptedException {
      System.err.println(mostFrequentSubstring("isisssi", 2));
   }
}
