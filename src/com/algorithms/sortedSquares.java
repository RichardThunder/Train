package com.algorithms;

public class sortedSquares {

}
//给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。
class Solution {
public int[] sortedSquares(int[] nums) {
    int[] sortedSquares=new int [nums.length];
    int head=0;
    int trail=nums.length-1;
    int current=nums.length-1;
    while(head<=trail) {//双指针查找
        int numsHead=nums[head]*nums[head];
        int numsTrail=nums[trail]*nums[trail];
        if(numsHead<=numsTrail) {
            sortedSquares[current] = numsTrail;
            trail--;
            current--;
        }
        else {sortedSquares[current]=numsHead;head++;current--;}
    }
    return sortedSquares;
}
}