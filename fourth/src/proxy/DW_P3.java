package proxy;

import java.util.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author sprite-pc
 * @description:
 * @date 2024/9/3 19:55
 */
public class DW_P3 {
    static int ans = Integer.MAX_VALUE;
    static boolean[][] isVisited = new boolean[21][21];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int startX = 0, startY=0;
        int endX = 0,endY = 0;
        int[][] grid = new int[n][m];
        for(int x = 0; x<n;x++){
            String temp = in.next();
            for(int y = 0; y<m;y++){
                if(temp.charAt(y) == 'W'){
                    grid[x][y] = 1;
                }
                else if(temp.charAt(y) =='B'){
                    startX = x;
                    startY = y;
                }
                else if(temp.charAt(y) == '*'){
                    endX = x;
                    endY = y;
                }
            }
        }
        isVisited[startX][startY] = true;
        dfs(startX,startY,endX,endY,3,grid,0);

        System.out.println(ans ==Integer.MAX_VALUE?-1:ans);


    }

    public static void dfs(int startX, int startY, int endX, int endY, int booms, int[][] grid, int step){
        if(startX == endX && startY == endY){
            ans = Math.min(step,ans);
            return;
        }
        int[][] dirs = new int[][]{{-1,0},{1,0},{0,1},{0,-1}};
        for(int[] dir:dirs){
            int newX = startX+dir[0];
            int newY = startY+dir[1];
            if(newX >=0 && newX < grid.length && newY>=0 && newY<grid[0].length && !isVisited[newX][newY]){
                if(grid[newX][newY] == 1){
                    if(booms >0){
                        isVisited[newX][newY]  =true;
                        dfs(newX,newY,endX,endY,booms-1,grid,step+1);
                        isVisited[newX][newY]  =false;
                    }
                }
                else{
                    isVisited[newX][newY]  =true;
                    dfs(newX,newY,endX,endY,booms,grid,step+1);
                    isVisited[newX][newY]  =false;
                }

            }
        }

    }
}
