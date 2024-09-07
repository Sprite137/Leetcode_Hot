/**
 * @author sprite-pc
 * @description:
 * @date 2024/9/5 18:10
 */
import java.util.*;

public class MB_P4 {
    static long MOD = (long) (1e9+7);
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        int n = in.nextInt();
        String s = in.next();

        long ans = 0;
        long base = 0;
        StringBuilder sb = new StringBuilder(s);
        for(char a: sb.toString().toCharArray()){
            if(a == 'R'){
                base++;
            }
        }
        for(char a : s.toCharArray()){
            if(a == 'R'){
                ans  = (ans + base) % MOD;
            }
            else {
                base++;
                ans  = (ans + base) % MOD;
            }
        }
        System.out.println(ans);
    }
}
