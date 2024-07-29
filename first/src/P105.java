import java.util.HashMap;
import java.util.Map;

public class P105 {
//    static int area;
//    public static void getArea(char[][] grid, int col, int row,boolean[][] visited){
//        visited[col][row] = true;
//        int[][] dirs = {{0,1},{0,-1},{1,0},{-1,0}};
//        for(int[] dir:dirs){
//            int now_col = col+dir[0],now_row = row+dir[1];
//            if( now_col>=0 && now_col < grid.length && now_row>=0 && now_row<grid[0].length && !visited[now_col][now_row] && grid[now_col][now_row] ==1){
//                area++;
//                getArea(grid,now_col,now_row,visited);
//            }
//        }
//    }
//    public static int numIslands(char[][] grid) {
//        int maxArea = Integer.MIN_VALUE;
//        for(int i=0;i< grid.length;i++){
//            for(int j=0;j<grid[0].length;j++){
//                if(grid[i][j]=='1'){
//                    area = 1;
//                    getArea(grid,i,j,new boolean[grid.length][grid[0].length]);
//                    maxArea = Math.max(maxArea,area);
//                }
//
//            }
//        }
//        if(maxArea==Integer.MIN_VALUE){
//            return 0;
//        }
//        else {
//            return maxArea;
//        }
//    }
//
//    public static void main(String[] args) {
//        char[][] grid = {
//                {'1','1','1','1','0'},
//                {'1','1','0','1','0'},
//                {'1','1','0','0','0'},
//                {'0','0','0','0','0'}};
//        int i = numIslands(grid);
//        System.err.println(i);
//    }
    private Map<Integer, Integer> indexMap;

    public TreeNode myBuildTree(int[] preorder, int[] inorder, int preorder_left, int preorder_right, int inorder_left, int inorder_right) {
        if (preorder_left > preorder_right) {
            return null;
        }

        // 前序遍历中的第一个节点就是根节点
        int preorder_root = preorder_left;      // 0
        // 在中序遍历中定位根节点
        int inorderRoot = indexMap.get(preorder[preorder_root]);        // 0

        // 先把根节点建立出来
        TreeNode root = new TreeNode(preorder[preorder_root]);
        // 得到左子树中的节点数目
        int sizeLeftSubtree = inorderRoot - inorder_left;       // 0-0

        // 先序遍历中「从 左边界+1 开始的 size_left_subtree」个元素就对应了中序遍历中「从 左边界 开始到 根节点定位-1」的元素       // 1, 1,  0, -1
        root.left = myBuildTree(preorder, inorder, preorder_left + 1, preorder_left + sizeLeftSubtree, inorder_left, inorderRoot - 1);

        // 先序遍历中「从 左边界+1+左子树节点数目 开始到 右边界」的元素就对应了中序遍历中「从 根节点定位+1 到 右边界」的元素
        root.right = myBuildTree(preorder, inorder, preorder_left + sizeLeftSubtree + 1, preorder_right, inorderRoot + 1, inorder_right);
        return root;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        // 构造哈希映射，帮助我们快速定位根节点
        indexMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            indexMap.put(inorder[i], i);        //
        }
        return myBuildTree(preorder, inorder, 0, n - 1, 0, n - 1);
    }

}
