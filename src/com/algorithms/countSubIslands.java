package com.algorithms;

public class countSubIslands {
public int countSubIslands(int[][] grid1, int[][] grid2) {
    int m=grid1.length;
    int n=grid1[0].length;
    for(int i=0;i<m;i++)
        for(int j=0;j<n;j++)
            if(grid1[i][j]==0&&grid2[i][j]==1)
                DFS(grid2,i,j);//淹没不是子岛的岛屿
    int count=0;
    for(int i=0;i<m;i++)
        for(int j=0;j<n;j++){
            if(grid2[i][j]==1){
                DFS(grid2,i,j);
                count+=1;
            }
        }
    return count;
}
public void DFS(int[][] grid,int i,int j){
int mLength=grid.length;
int nLength=grid[0].length;
if(i<0||j<0||i>=mLength||j>=nLength)
    return;
if(grid[i][j]==0)
    return;
grid[i][j]=0;
    DFS(grid,i-1,j);
    DFS(grid,i+1,j);
    DFS(grid,i,j-1);
    DFS(grid,i,j+1);
}
}
