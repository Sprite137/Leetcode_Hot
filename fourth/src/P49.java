import java.util.*;

public class P49 {
    public List<List<String>> groupAnagrams(String[] strs) {


        Map<String,List<String>> map = new HashMap<>();
        for(String str :strs ){
            int[] bits = new int[26];
            for(char a: str.toCharArray()){
                bits[a-'a']++;
            }
            List<String> temp = map.getOrDefault(Arrays.toString(bits),new ArrayList<>());
            temp.add(str);
            map.put(Arrays.toString(bits),temp);
        }

        return new ArrayList<>(map.values());


    }
}
