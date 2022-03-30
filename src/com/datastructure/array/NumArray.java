package com.datastructure.array;
/*
public class NumArray {
private int[] num;

public NumArray(int[] nums) {
    num = new int[nums.length];
}

public int sumRange(int left, int right) {
    int sum = 0;
    for (int j = left; j <= right; j++) {
        sum += this.num[j];
    }
    return sum;
}*/
class NumArray {
int[] preSum;
public NumArray(int[] nums) {
    preSum = new int[nums.length+1];
    preSum[0]=0;
    for(int i=0;i<nums.length;i++){
        preSum[i+1]=preSum[i]+nums[i];
    }
}

public int sumRange(int left, int right) {
    if(left==0) return preSum[right+1];
    return preSum[right+1]-preSum[left];
}




}
