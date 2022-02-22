package com.algorithms;

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version);
278. 第一个错误的版本
你是产品经理，目前正在带领一个团队开发新的产品。不幸的是，你的产品的最新版本没有通过质量检测。由于每个版本都是基于之前的版本开发的，所以错误的版本之后的所有版本都是错的。

假设你有 n 个版本 [1, 2, ..., n]，你想找出导致之后所有版本出错的第一个错误的版本。

你可以通过调用 bool isBadVersion(version) 接口来判断版本号 version 是否在单元测试中出错。实现一个函数来查找第一个错误的版本。你应该尽量减少对调用 API 的次数。

 */

public class firstBadVersion extends VersionControl {
public int firstBadVersion(int n) {
    int head = 1;
    int trail = n;
    int bad = 0;
    if (!isBadVersion(n))
        return bad;

    while (head <= trail) {
        int middle = head + (trail - head) / 2;//大整数出现溢出
        // if(isBadVersion(middle)&&!isBadVersion(middle-1)){//符合第一个错误的条件
        //     bad=middle;
        //     break;
        // }
        if (!isBadVersion(middle)) {//向后查找
            head = middle + 1;

        }
        else {//向前查找
            trail = middle;
        }
    }
    return bad;
}
}