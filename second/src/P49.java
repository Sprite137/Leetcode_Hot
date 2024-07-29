import java.util.*;

public class P49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<String,List<String> > map = new LinkedHashMap<>();
        for(String s: strs){
            int[] bitmaps = new int[26];
            for(char a: s.toCharArray()){
                bitmaps[a-'a']++;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(Arrays.toString(bitmaps));
            if (!map.containsKey(sb.toString())){
                map.put(sb.toString(),new ArrayList<>(List.of(s)));
            }else {
                map.get(sb.toString()).add(s);
            }

        }
        ans.addAll(map.values());
        return ans;


    }

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        P49 x = new P49();
        System.err.println(x.groupAnagrams(strs));
    }
}
