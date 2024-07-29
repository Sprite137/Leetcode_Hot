import java.util.*;

public class P763 {
    public static List<Integer> partitionLabels(String s) {
        int index = 0;
        List<String> list  = new LinkedList<>();
        list.add(String.valueOf(s.charAt(0)));
//        while(getLargest(s,list[0])!=0){
//
//        }
        while(getLargest(s, list.get(0))!=0){
            list.set(0,s.substring(0,getLargest(s,list.get(0))));
        }
        System.err.println(list);
        return null;
    }

    public static int getLargest(String s,String s_need){
        HashSet<Character> set = new HashSet<>();
        for(char a:s_need.toCharArray()){
            set.add(a);
        }
        int ans = 0;
        for(int i=0;i<s.length();i++){
            if(set.contains(s.charAt(i))){
                ans = i;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "ababcbacadefegdehijhklij";
        System.err.println(partitionLabels(s));
    }
}
