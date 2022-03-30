package com.datastructure.array;

public class rotate {
public void rotate(int[][] matrix) {
    int m=matrix.length;
    int n=matrix[0].length;
    if(m==0||n==0||m!=n) return;
    for(int i=0; i<n; i++){
        for(int j=i+1;j<n;j++){
            int temp=matrix[i][j];
            matrix[i][j]=matrix[j][i];
            matrix[j][i]=temp;
        }
    }
    for(int[]submatrix: matrix){
        reverse(submatrix);
    }

}
public void reverse(int[] array){
    int high=array.length-1;
    int low=0;
    while(low<high){
        int temp=array[low];
        array[low]=array[high];
        array[high]=temp;
        low++;
        high--;

    }
}
}
