/**
 * @author sprite-pc
 * @description:
 * @date 2024/9/25 20:09
 */

import java.util.*;
public class XL_P3 {


    // 注意类名必须为 Main, 不要有任何 package xxx 信息
        static int ans = 0;
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt(), k = in .nextInt();
            int[] profits = new int[n];
            int[] categorys = new int[n];
            for(int i = 0; i<n ;i++){
                profits[i] = in.nextInt();
                categorys[i] = in.nextInt();
            }
            dfs(profits, categorys,k,0,0,new ArrayList<>());
            System.out.println(ans);
        }

        public static void dfs(int[] profits, int[] categorys, int k, int index, int length, List<Integer> base){
            if(length == k || index == profits.length){
                if(length == k){
                    int sum = 0;
                    Set<Integer> set = new HashSet<>();
                    for(int index_base: base){
                        sum += profits[index_base];
                        set.add(categorys[index_base]);
                    }
                    ans  = Math.max(ans,sum + (int)Math.pow(set.size(),2));
                }

                return;
            }
            base.add(index);
            dfs(profits,categorys, k, index+1,length+1,base);
            base.remove(base.size()-1);

            dfs(profits,categorys, k, index+1,length,base);
        }
}
