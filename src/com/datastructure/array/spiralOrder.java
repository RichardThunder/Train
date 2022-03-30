package com.datastructure.array;

import java.util.ArrayList;
import java.util.List;

public class spiralOrder {
public List<Integer> spiralOrder(int[][] matrix) {
   int m=matrix.length;
   int n=matrix[0].length;
   List<Integer> res=new ArrayList<>();
   int upBound=0,leftBound=0, rightBound=n-1,downBound=m-1;

   while(res.size()<m*n){
      if(upBound<=downBound){
         for(int i=leftBound;i<=rightBound;i++){
            res.add(matrix[upBound][i]);
         }
         upBound++;
      }
      if(rightBound>=leftBound){
         for(int i=upBound;i<=downBound;i++){
            res.add(matrix[i][rightBound]);
         }
         rightBound--;
      }
      if(downBound>=upBound){
         for(int i=rightBound;i>=leftBound;i--){
            res.add(matrix[downBound][i]);
         }
         downBound--;
      }
      if(rightBound>=leftBound){
         for(int i=downBound;i>=upBound;i--){
            res.add(matrix[i][leftBound]);
         }
         leftBound++;
      }
   }
   return res;
}
}
