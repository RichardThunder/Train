package com.datastructure.array;

public class shipWithinDays {
public int shipWithinDays(int[] weights, int days) {
    int max = 0, sum = 0;
    for (int weight : weights) {
        max = Math.max(max, weight);
        sum += weight;
    }
    int left = max, right = sum;
    while (left <= right) {
        int mid = left + (right - left) / 2;
        int cur = 0;
        int times = 1;//注意；
        for (int weight : weights) {
            if (cur + weight > mid) {
                times++;
                cur = 0;
            }
            cur += weight;
        }
        if (times > days)
            left = mid + 1;
        else
            right = mid - 1;
    }
    return left;
}
}