package com.algorithms;
//给你一个数组，将数组中的元素向右轮转 k 个位置，其中 k 是非负数。
public class Rotate {
}

class Solution1 {//使用额外的数组
public void rotate(int[] nums, int k) {
    int length=nums.length;
    int [] array = new int[length];
    for(int i=0; i<length;i++){
        array[(k+i)%length]=nums[i];
    }
    System.arraycopy(array,0,nums,0,length);
}
}
class Solution2 {//rotate

public void rotate(int[] nums, int k) {
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k%nums.length-1);
        reverse(nums,k%nums.length,nums.length-1);
}
public void reverse(int[] nums,int head,int trail) {
    while(head<trail){
        nums[head]=nums[head]^nums[trail];
        nums[trail]=nums[head]^nums[trail];
        nums[head]=nums[head]^nums[trail];
        head++;
        trail--;
    }
}
}