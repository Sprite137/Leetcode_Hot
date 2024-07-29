import java.util.ArrayList;
import java.util.Collections;

public class P2007 {
    public int[] findOriginalArray(int[] changed) {
        if(changed.length%2!=0){
            return new int[0];
        }
        int[] res = new int[changed.length/2];
        int index = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int num:changed){
            list.add(num);
        }
        for(int num:changed){
            if(num%2==0 ){
                if(list.contains(num/2) || list.contains(num*2)){
                    res[index++] = num;
                }
                else {
                    return new int[0];
                }

            }
            if(num%2!=0){
                if(!list.contains(num*2)){
                    return new int[0];
                }
                else {
                    res[index++] = num;
                }
            }
        }
        return res;
    }
}
