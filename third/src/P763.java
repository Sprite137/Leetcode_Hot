import java.util.*;

/**
 * @author: xuzhi
 * @data: 2024/7/10
 */
public class P763 {
    public static List<Integer> partitionLabels(String s) {
        List<Integer> ans = new ArrayList<>();

        Map<Character,int[]> map = new HashMap<>();

        // 记录每个单词的始终
        for(int i = 0;i<s.length(); i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),new int[]{i,i});
            }
            else {
                map.put(s.charAt(i),new int[]{map.get(s.charAt(i))[0],i});
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
        // 合并区间
        for(int i = 1;i<list.size();i++){
            if(stack.peek()[1] > list.get(i)[0]){
                if(stack.peek()[1] >= list.get(i)[1]){
                    continue;
                }
                else {
                    int[] temp = stack.pop();
                    stack.add(new int[]{temp[0],list.get(i)[1]});
                }
            }
            else {
                stack.add(list.get(i));
            }
        }
        for(int[] ints: stack){
             ans.add(ints[1]-ints[0]+1);
//             stack.pop();
        }
        return ans;

    }

    public static void main(String[] args) {
        partitionLabels("ababcbacadefegdehijhklij");
    }
}
