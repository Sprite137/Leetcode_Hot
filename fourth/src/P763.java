import com.sun.xml.internal.fastinfoset.tools.XML_SAX_StAX_FI;

import java.util.*;

/**
 * @author sprite-pc
 * @description:
 * @date 2024/8/20 21:52
 */
public class P763 {
    public static List<Integer> partitionLabels(String s) {
        Map<Character, int[]> map = new HashMap<>();
        for(int i = 0 ; i< s.length(); i++ ){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),new int[]{i,i});
            }
            else{
                int[] temp = map.get(s.charAt(i));
                temp[1] = i;
                map.put(s.charAt(i),temp);
            }
        }
        List<int[]> list = new ArrayList<>(map.values());
        list.sort(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        Stack<int[]> stack = new Stack<>();
        stack.add(list.get(0));
        for(int i = 1;i<list.size(); i++){
            if(!stack.isEmpty() && stack.peek()[1] > list.get(i)[0]){
                int[] temp = stack.pop();
                temp[1] = Math.max(temp[1],list.get(i)[1]);
                stack.push(temp);
            }
            else {
                stack.add(list.get(i));
            }
        }
        List<Integer> ans = new ArrayList<>();
        while(!stack.isEmpty()){
            int[] temp = stack.pop();
            ans.add(temp[1]-temp[0]+1);
        }
        Collections.reverse(ans);
        return ans;

    }

    public static void main(String[] args) {
        System.err.println(partitionLabels("ababcbacadefegdehijhklij"));
    }
}
