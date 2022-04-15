package com.datastructure.array;

public class minEatingSpeed {
public int minEatingSpeed(int[] piles, int h) {
    //如果H<piles.length,那么K 无解!
    if (h < piles.length)
        return -1;
    // 如果H=piles.length 那么K=Max(piles[])
    if (h == piles.length) {
        int max = 0;
        for (int num : piles) {
            max = max > num ? max : num;
        }
        return max;
    }
    //如果H》piles.length 那么 K《= Max
    //求出最大堆
    int max = 0;
    for (int num : piles) {
        max = max > num ? max : num;
    }

    int left = 1, right = max;//注意此时区间为[1,max] 而不是[0,max]
    //二分法
    while (left <= right) {
        int mid = left + (right - left) / 2;
        int time = 0;
        for (int num : piles) {
            time += (num + mid - 1) / mid;//向上取整q 使用除法！而不是累减
        }
        if (time > h)
            left = mid + 1;
            //向左👈搜索
        else if (time <= h) {
            right = mid - 1;
        }
    }
    return left > max ? max : left;
}

}