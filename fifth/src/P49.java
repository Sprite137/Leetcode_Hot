/**
 * @author sprite-pc
 * @description:
 * @date 2024/10/5 21:29
 */
import java.util.*;
public class P49 {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String ,List<String>> map = new HashMap<>();
        for(String str : strs){
            char[] temp = str.toCharArray();
            Arrays.sort(temp);
            List<String> tempList = map.getOrDefault(Arrays.toString(temp),new ArrayList<>());
            tempList.add(str);
            map.put(Arrays.toString(temp), tempList);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        System.err.println(groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
    }
}
