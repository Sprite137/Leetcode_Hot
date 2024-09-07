import java.util.*;

/**
 * @author sprite-pc
 * @description:
 * @date 2024/9/5 16:52
 */
public class XM_P2 {

        static int ans = Integer.MAX_VALUE;
        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int x = in.nextInt();
            List<Integer> list = new ArrayList<>();

            int sum = 0;
            for(int i = 0; i < n ;i++){
                list.add(in.nextInt());
                sum += list.get(list.size()-1);
            }
            if(sum % x ==0){
                System.out.println(0);
                return;
            }
            if(n == 1){
                System.out.println(1);
                return;
            }
            dfs(list,sum,x,0);
            System.out.println(ans);
        }

        public static void dfs(List<Integer> list, int sum,int x, int step){
            if(sum %x == 0 || step >= ans){
                ans =  Math.min(ans,step);
            }else{
                for(int i = 0; i <list.size(); i++){
                    // 删除元素
                    int temp = list.get(i);
                    sum -= temp;
                    list.remove(i);
                    dfs(list,sum,x,step+1);
                    list.add(i,temp);
                    sum += temp;

                    // 减1
                    sum -= 1;
                    list.set(i,list.get(i)-1);
                    dfs(list,sum,x,step+1);
                    list.set(i,list.get(i)+1);
                    sum +=1;
                }

            }
        }
}
