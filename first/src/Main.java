import com.sun.source.tree.Tree;

import javax.print.DocFlavor;
import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
////        int n = sc.nextInt();
//        Map<Integer, TreeNode> map;
//        map = new HashMap<>();
//        int edges = sc.nextInt();
//        for(int i=0;i<edges; i++){
//            int from = sc.nextInt();
//            int to = sc.nextInt();
//            if(!map.containsKey(from)){
//                map.put(from,new TreeNode(from));
//            }
//            TreeNode node_form = map.get(from);
//            TreeNode node_to = new TreeNode(to);
//            if(node_form.left==null){
//                node_form.left = node_to;
//            }
//            else {
//                node_form.right = node_to;
//            }
//            map.put(to,node_to);
//        }
//        TreeNode.dfs(map.get(0));
        String a = "abc";
        String b =  new String("abc").intern();
        System.err.println(a==b);
    }
}