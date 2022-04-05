package com.datastructure.array;

import java.util.Random;

public class Solution {
private int[] preSum;
private Random rand=new Random();
public Solution(int[] w) {
    int[] presum=new int[w.length+1];
    presum[1]=w[0];
    for(int i=2;i<w.length;i++){
        presum[i]=w[i-1]+presum[i-1];
    }
}

public int pickIndex() {
    int n = preSum.length;
    int target=rand.nextInt(preSum[n-1])+1;
    return left_bound(preSum,target)-1;
}
private int left_bound(int[] nums, int target) {
    // 见上文
}

}