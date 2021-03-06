package com.algorithms;

/*704. 二分查找
        给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target  ，写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。
*/
class search {

public int search(int[] nums, int target) {
    int head = 0;
    int trail = nums.length - 1;
    int index = -1;
    while (head <= trail) {
        int middle = head + (trail - head) / 2;
        if (target > nums[middle]) {
            head = middle + 1;
        }
        else if(target==nums[middle]){
            index=middle;
            break;
        }
        else trail=middle-1;
    }

    return index;
}}

