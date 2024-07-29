public class P547 {


    // 并查集
    public int find(int[] parent, int index){

        if(index != parent[index]){
            parent[index] = find(parent,parent[index]);
        }
        return parent[index];
    }

    public void union(int[] parent, int index1, int index2){
        parent[find(parent,index1)] = find(parent,index2);
    }


    public int findCircleNum(int[][] isConnected) {
        int cities = isConnected.length;
        int[] parent = new int[cities];
        for (int i=0;i<cities;i++){
            parent[i] = i;
        }
        for (int i=0;i<cities;i++){
            for(int j=i+1; j < cities; j++){
                if(isConnected[i][j]==1){
                    union(parent,i,j);
                }
            }
        }
        int ans = 0;
        for(int i=0;i<cities;i++){
            if(parent[i]==i){
                ans++;
            }
        }
        return ans;
    }


}
