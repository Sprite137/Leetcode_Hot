import java.util.ArrayList;
import java.util.List;

public class P93 {
    List<String> ans = new ArrayList<>();
//    public List<String> restoreIpAddresses(String s) {
//        dfs(s,0,0,"","");
//        return ans;
//    }
//
//    public void dfs(String s, int index,int segIndex, String seg, String base){
//        if(index==s.length() && segIndex==3 && isVaild(seg)){
//            ans.add(base+seg);
//        }
//        else if (index<s.length() && segIndex<=3){
//            char a = s.charAt(index);
//            if(isVaild(seg+a)){
//                dfs(s,index+1,segIndex,seg+a,base);
//            }
//
//            if(!seg.isEmpty() && segIndex<3){
//                dfs(s,index+1,segIndex+1,""+a,base+seg+'.');
//            }
//        }
//    }
//
//    public boolean isVaild(String seg){
//        return Integer.parseInt(seg)<=255 && (seg.charAt(0)!='0' || "0".equals(seg));
//    }
    public List<String> restoreIpAddresses(String s) {
        dfs(s,0,0,"","");
        return ans;
    }


    public void dfs(String s, int index, int segNum,String base, String seg){
        if(index==s.length() && segNum == 3 && isValid(seg)){
            ans.add(base+seg);
        }
        else if(index < s.length()){
            char a = s.charAt(index);
            if(isValid(seg+a)){
                dfs(s,index+1, segNum,base,seg+a);
            }

            if(!seg.isEmpty() && segNum<=3){
                dfs(s,index+1,segNum+1,base+seg+'.',""+a);
            }
        }
    }


    public boolean isValid(String s){
        return Integer.parseInt(s)<=256 && ("0".equals(s) || s.charAt(0) != '0');
    }
}
