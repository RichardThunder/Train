package com.algorithms;

import java.util.Random;

public class sortArray {
public int[] sortArray(int[] nums) {
int length = nums.length;
quickSort(nums,0,length-1);
return nums;
}
void quickSort(int[] nums,int start,int end) {
    if(start>=end)
        return;
    int pivot=partition(nums,start,end);
    quickSort(nums,start,pivot-1);
    quickSort(nums,pivot+1,end);
}

/*int partition(int[] nums, int start, int end) {
    //随机选点 保持
    int i = new Random().nextInt(end - start + 1) + start;
    int temp = nums[i];
    nums[i] = nums[start];
    nums[start] = temp;
    int pivot = nums[start];

    while (start < end) {
        while (start < end && nums[end] >= pivot)
            end--;
        nums[start] = nums[end];
        while (start < end && nums[start] < pivot)
            start++;
        nums[end] = nums[start];
    }
    nums[start] = pivot;
    return start;
}*/

int partition(int[]nums,int start,int end){
    int pivot = nums[start];
    int p=start+1;
    int q=end;
    while (p<=q){
        while (p<q&& nums[p] < pivot) p++;
        while (p<q&& nums[q]>pivot) q--;
        if(p<q){
            int temp = nums[p];
            nums[p] = nums[q];
            nums[q] = temp;
        }
    }
    int temp = nums[start];
    nums[start] =nums[q];
    nums[q]=temp;
    return q;
}

}
