package com.datastructure.array;

public class searchRange {
/*public int[] searchRange(int[] nums, int target) {
    //二分查找直到找到target，此时 mid==target
    //mid左右两边进行二分查找 找到左右边界
    int[] res = new int[2];//[low,high]
    if(nums.length==0) return res = new int[]{-1, -1};
    int left = 0, right = nums.length;
    int mid = left + (right - left) / 2;

    while (left <= right) {
        mid = left + (right - left) / 2;
        if (nums[mid] < target) {
            left = mid + 1;
        }
        if (nums[mid] > target) {
            right = mid - 1;
        }
        if (nums[mid] == target) {
            break;
        }
        //找到了一个target，返回mid，left，right，此时target在[left，right]区间内
    }
    //如果没有找到，此时left>right
    if (left > right)
        return res = new int[]{-1, -1};
    else {
        res[0]=left_bound(nums,target);
        res[1]=right_bound(nums,target);
        return res;
    }
}
int left_bound(int[] nums,int target){
    int left=0,right=nums.length-1;
    while(left<=right){
        int mid = left + (right - left) / 2;
        if(nums[mid]<target) left=mid+1;
        else if(nums[mid]>target) right=mid-1;
        else if(nums[mid]==target) right=mid-1;
    }
    return left>=nums.length? -1:left; //注意如果没有·检查是否存在，需要返回时检查 （nums【left】== target）
}

int right_bound(int[] nums,int target){
    int left=0,right=nums.length-1;
    while(left<=right){
        int mid=left + (right - left) / 2;
        if(nums[mid]>target) right=mid-1;
        if(nums[mid]<target) left=mid+1;
        if(nums[mid]==target) left=mid+1;
    }
    return right<0 ? -1:right; //注意如果没有·检查是否存在，需要返回时检查 （nums【right】== target）
}*/














public int[] searchRange(int[] nums, int target) {
    int[] res;
    if(nums==null) return res=new int[]{-1,-1};
    //闭区间[0,num_len]
    res=new int[2];
    res[0]=left_bound(nums,target);
    res[1]=right_bound(nums,target);
    return res;
}

//←--区间
int left_bound(int[] nums,int target){
    int left=0,right=nums.length-1;
    while(left<=right){
        int mid=left+(right-left)/2;
        if(nums[mid] < target) left=mid+1;
        if(nums[mid]>target) right=mid-1;
        if(nums[mid]==target) right=mid-1;
    }
    return left>= nums.length || nums[left]!=target ?
                    -1:left;
}
int right_bound(int[] nums,int target){
    int left=0,right=nums.length-1;
    while(left<=right){
        int mid = left + (right - left) / 2;
        if(nums[mid] > target) right=mid-1;
        if(nums[mid]<target) left=mid+1;
        if(nums[mid]==target) left=mid+1;
    }
    return right<0 || nums[right] != target ?
            -1:right;
}
}
























