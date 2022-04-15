package com.datastructure.array;
import java.util.Random;
public class Solution {
private int[] preSum;
private Random rand = new Random();
private int n;
public Solution(int[] w) {
    this.n = w.length;
    preSum = new int[n];
    preSum[0] = w[0];
    for (int i = 1; i < w.length; i++) {
        preSum[i] = w[i] + preSum[i - 1];
    }
}
public int pickIndex() {
    //取区间【1，presum[n-1]】
    int target = rand.nextInt(preSum[n - 1]) + 1;
    int left = 0, right = n - 1;
    while (left <= right) {
        int mid = left + (right - left) / 2;
        if (preSum[mid] == target)
            return mid;
        else if (preSum[mid] > target)
            right = mid - 1;
        else if (preSum[mid] < target)
            left = mid + 1;
    }
    return left;
}


}
