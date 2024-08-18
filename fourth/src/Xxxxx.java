import java.util.Scanner;

/**
 * @author sprite-pc
 * @description:
 * @date 2024/8/17 10:27
 */
public class Xxxxx {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        int n = in.nextInt();
        int m = in.nextInt();
        String sn = in.next();
        String sm = in.next();

        int nStart = -1;
        int mStart = -1;
        for (int i = 0; i < m; i++) {
            boolean flag = true;
            for (int j = 0; j < n ; j++) {
                if(i +j >=m){
                    continue;
                }
                if (sn.charAt(j) + sm.charAt(i + j) -96 > 3) {
                    flag = false;
                    break;
                }

            }
            if (flag) {
                nStart = i;
                break;
            }

        }
        for (int i = 0; i < n; i++) {
            boolean flag = true;
            for (int j = 0; j < m ; j++) {
                if(i +j >=n){
                    continue;
                }
                if (sn.charAt(i+j) + sm.charAt(j) -96 > 3) {
                    flag = false;
                    break;
                }

            }
            if (flag) {
                mStart = i;
                break;
            }

        }
        if(mStart == -1 && nStart == -1){
            System.out.println(n+m);
            return;
        }

        if(nStart != -1 && mStart!= -1){
            System.out.println(Math.min(Math.max(m+mStart,n),Math.max(n+nStart,m)));
            return;
        }
        if(mStart != -1){       // mStart
            System.out.println(Math.max(m+mStart,n));
            return;
        }
        System.out.println(Math.max(n+nStart,m));      // nStart
        return;

    }


}
