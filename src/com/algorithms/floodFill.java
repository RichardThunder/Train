package com.algorithms;

import java.util.LinkedList;
import java.util.Queue;

public class floodFill {

/*
//获取初始像素值大小 如果相等就不必更改
//调用递归函数 深度优先搜索
public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
    int initColor=image[sr][sc];
    if(initColor==newColor)
    return image;
    recursivePixels(image,initColor,newColor,sr,sc);
    return image;
}
public void recursivePixels(int[][] image,int initColor,int newColor, int sr,int sc){
    if(image[sr][sc]==initColor){
        image[sr][sc]=newColor;
        if(sc>=1 &&image[sr][sc-1]==initColor){
            recursivePixels(image,initColor,newColor,sr,sc-1);
        }
        if(sc<=image[sr].length-2&&image[sr][sc+1]==initColor){
            recursivePixels(image,initColor,newColor,sr,sc+1);
        }
        if(sr>=1&&image[sr-1][sc]==initColor){
            recursivePixels(image,initColor,newColor,sr-1,sc);
        }
        if(sr<=image.length-2 &&image[sr+1][sc]==initColor){
            recursivePixels(image,initColor,newColor,sr+1,sc);
        }
    }
// 执行用时：
// 0 ms
// , 在所有 Java 提交中击败了
// 100.00%
// 的用户
// 内存消耗：
// 41.9 MB
// , 在所有 Java 提交中击败了
// 27.19%
// 的用户
// 通过测试用例：
// 277 / 277
}*/

public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
    int oldColor =image[sr][sc];
    if(oldColor==newColor) {
    return image;}
    
    Queue<int[]> queue =new LinkedList<int[]>();
    queue.offer(new int[]{sr,sc});

    while(!queue.isEmpty()) {
        int[] cell = queue.poll();
        image[cell[0]][cell[1]]=newColor;
        if(cell[1]>=1 &&image[cell[0]][cell[1]-1]==oldColor){
            queue.offer(new int[]{cell[0],cell[1]-1});
        }
        if(cell[1]<=image[cell[0]].length-2&&image[cell[0]][cell[1]+1]==oldColor){
            queue.offer(new int[]{cell[0],cell[1]+1});
        }
        if(cell[0]>=1&&image[cell[0]-1][cell[1]]==oldColor){
            queue.offer(new int[]{cell[0]-1,cell[1]});
        }
        if(cell[0]<=image.length-2 &&image[cell[0]+1][cell[1]]==oldColor){
            queue.offer(new int[]{cell[0]+1,cell[1]});
        }
    }

    return image;
}



}
