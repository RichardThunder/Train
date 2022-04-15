package com.datastructure.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class nextGreaterElement {
public int[] nextGreaterElement(int[] nums1, int[] nums2) {
    Stack<Integer> stack = new Stack<Integer>();
    Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
    //nums2中的元素倒序入栈，
    //进入时需要判断栈不为空，并且大于栈顶的元素。 需要pop栈顶，直到清空或者遇到比他大的；
    //如果如果不比栈顶大，元素入栈之前以当前当前元素和栈顶元素组成的键值对加入hashmap。
    for (int i = nums2.length - 1; i >= 0; i--) {
        int num = nums2[i];
        while (!stack.isEmpty() && num >= stack.peek()) {//因为是无重复数组，所以可以去掉等于
            stack.pop();
        }
        hashMap.put(num, stack.isEmpty() ? -1 : stack.peek());
        stack.push(num);
    }
    int[] res = new int[nums1.length];
    for (int i = 0; i < nums1.length; i++) {
        res[i] = hashMap.get(nums1[1]);
    }
    return res;

}
}
