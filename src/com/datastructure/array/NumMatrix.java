package com.datastructure.array;

public class NumMatrix {
int[][] preSum;//初始化为0
public NumMatrix(int[][] matrix) {
preSum = new int[matrix.length+1][matrix[0].length+1];
    if(matrix.length==0||matrix[0].length==0) return;
for (int i=1;i<preSum.length;i++){
    for (int j=1;j<preSum[0].length;j++){
        preSum[i][j]=preSum[i][j-1]+preSum[i-1][j]+matrix[i-1][j-1]-preSum[i-1][j-1];
    }
}
}

public int sumRegion(int x1, int y1, int x2, int y2) {
    // 目标矩阵之和由四个相邻矩阵运算获得
    return preSum[x2+1][y2+1] - preSum[x1][y2+1] - preSum[x2+1][y1] + preSum[x1][y1];
}
}
