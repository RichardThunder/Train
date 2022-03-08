package com.algorithms;

import java.util.LinkedList;
import java.util.Queue;

public class maxAreaOfIsland {
/*public int maxAreaOfIsland(int[][] grid) {
    int max=0;
    int mLength = grid.length;
    int nLength = grid[0].length;
    for (int i=0; i<mLength;i++){
        for(int j=0;j<nLength;j++){
            if(grid[i][j]==1){
                max=Math.max(max,BFS(grid,i,j,mLength,nLength));}
        }
    }
    return max;
}
public int BFS(int[][] grid,int i,int j,int mLength,int nLength) {

    int areaOfIsland=0;
    Queue<int[]> queue = new LinkedList<int[]>();
    queue.offer(new int[]{i,j});
    while(!queue.isEmpty()){
        int[] cell=queue.poll();
        grid[cell[0]][cell[1]]=0;
        areaOfIsland+=1;
        System.out.println(cell[0]+" "+cell[1]);
        if(cell[1]>=1 &&grid[cell[0]][cell[1]-1]==1){
            queue.offer(new int[]{cell[0],cell[1]-1});
            grid[cell[0]][cell[1]-1]=0;
        }
        if(cell[1]<=nLength-2&&grid[cell[0]][cell[1]+1]==1){
            queue.offer(new int[]{cell[0],cell[1]+1});
            grid[cell[0]][cell[1]+1]=0;
        }
        if(cell[0]>=1&&grid[cell[0]-1][cell[1]]==1){
            queue.offer(new int[]{cell[0]-1,cell[1]});
            grid[cell[0]-1][cell[1]]=0;
        }
        if(cell[0]<=mLength-2 &&grid[cell[0]+1][cell[1]]==1){
            queue.offer(new int[]{cell[0]+1,cell[1]});
            grid[cell[0]+1][cell[1]]=0;
        }

    }
    return areaOfIsland;
}*/
public int maxAreaOfIsland(int[][] grid) {
    int areaOfIsland=0;
    int mLength=grid.length;
    int nLength=grid[0].length;
    for(int i=0;i<mLength;i++){
        for(int j=0;j<nLength;j++){
            if(grid[i][j]==1)
            areaOfIsland=Math.max(areaOfIsland,DFS(grid,i,j));
        }
    }

    return areaOfIsland;
}
public int DFS(int[][] grid,int i,int j){
    int mLength= grid.length;
    int nLength= grid[0].length;
    if(i<0||i>=mLength||j<0||j>=nLength)
        return 0;
    if(grid[i][j]==0)
    return 0;
    grid[i][j] = 0;
    return DFS(grid,i+1,j)+
            DFS(grid,i-1,j)+
            DFS(grid,i,j+1)+
            DFS(grid,i,j-1)+1;
}
}
