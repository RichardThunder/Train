package com.datastructure.array;

public class generateMatrix {
public int[][] generateMatrix(int n) {
    int[][] res=new int[n][n];
    int leftBound=0,upBound=0,rightBound=n-1,downBound=n-1;
    int curr=0;
    while (curr<n*n){
        if(upBound<=downBound){
            for(int i=leftBound;i<=rightBound;i++){
                res[upBound][i]=++curr;
            }
            upBound++;
        }
        if(rightBound>=leftBound){
            for(int i=upBound;i<=downBound;i++){
                res[i][rightBound]=++curr;
            }
            rightBound--;
        }
        if(upBound<=downBound){
            for(int i=rightBound;i>=leftBound;i--){
                res[downBound][i]=++curr;
            }
            downBound--;
        }
        if(rightBound>=leftBound){
            for(int i=downBound;i>=upBound;i--){
                res[i][leftBound]=++curr;
            }
            leftBound++;
        }
    }
return res;
}
}
