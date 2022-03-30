package com.datastructure.array;

public class subarraySum {
int[] preSum;

public int subarraySum(int[] nums, int k) {
    if(nums.length==0) return 0;
    preSum=new int[nums.length+1];
    for(int i=1;i<preSum.length;i++){
        preSum[i]=preSum[i-1]+nums[i-1];
    }
    int count=0;
    for(int i=0;i<preSum.length;i++){
        for (int j=0;j<i;j++)
        {
            if(preSum[i]-preSum[j]==k)
                count+=1;
        }
    }
    return count;

}
}
