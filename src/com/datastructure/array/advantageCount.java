package com.datastructure.array;

import java.util.Arrays;
import java.util.PriorityQueue;

public class advantageCount {
public int[] advantageCount(int[] nums1, int[] nums2) {
    // PriorityQueue<int[]> maxq=new PriorityQueue<>(
    //         (int[] pair1, int[] pair2)->{
    //             return pair2[1]-pair1[1];
    //         }
    // );
    // for(int i=0;i< nums2.length;i++){
    //     maxq.offer(new int[]{i,nums2[i]});
    // }
    // Arrays.sort(nums1);
    // int left=0,right=nums1.length-1;
    // //存储a的排列
    // int[]res=new int[nums1.length];
    //
    // while (!maxq.isEmpty()){
    //     int[] pair= maxq.poll();
    //     int i=pair[0], maxval=pair[1];
    //     if(maxval<nums1[right]){
    //         res[i]=nums1[right];
    //         right--;
    //     }else{
    //         res[i]=nums1[left];
    //         left++;
    //     }
    // }
    // return res;
    PriorityQueue<int[]> maxq = new PriorityQueue<>((int[] pair1, int[] pair2) -> {
        return pair2[1] - pair1[1];
    });
    for (int i = 0; i < nums2.length; i++) {
        maxq.offer(new int[]{i, nums2[i]});
    }
    Arrays.sort(nums1);
    int left = 0, right = nums1.length - 1;
    int[] res = new int[nums1.length];
    while (!maxq.isEmpty()) {
        int[] pair = maxq.poll();
        if (nums1[right] > pair[1]) {
            res[pair[0]] = nums1[right];
            right--;
        }
        else {
            res[pair[0]] = nums1[left];
            left++;
        }
    }
    return res;


}
}
