import java.util.Scanner;

public class P1001 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        int n = in.nextInt();
        for(int i=0; i<n; i++){
            int length = in.nextInt();
            String a = in.next();
            String b = in.next();
            if(a.compareTo(b) >= 0){
                System.out.println(0);
            }
//            else {
//                int index = length;
//                int ans = 1;
//                while(index !=0 || a.charAt(index) > b.charAt(index)){
//                    if(a.charAt(index) > b.charAt(index))
//                }
//            }
//
        }
    }


}
