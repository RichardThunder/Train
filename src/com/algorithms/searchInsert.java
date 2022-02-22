package com.algorithms;
// 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
//
//         请必须使用时间复杂度为 O(log n) 的算法。

public class searchInsert {
}
class Solution {
public int searchInsert(int[] nums, int target) {
    int head=0;
    int trail=nums.length-1;
    int middle=0;
    int index=-1;
    while(head<trail){
        middle=head+(trail-head)/2;
        if(target==nums[middle]){
            index=middle;
            break;
        }
        else if(target>nums[middle]){
            head=middle+1;
        }
        else trail=middle-1;
    }
    if(index==-1){//没有找到 trail<head
        if(trail<0)//防止数组越左边界
            index=0;
        else if (head>nums.length-1)//防止数组越右边界
            index=nums.length;
        else if (target<nums[trail])
            index=trail;
        else if(target > nums[trail] && target < nums[head]){
            index=head;
        }
        else index=head+1;
    }
    return index;
}
}