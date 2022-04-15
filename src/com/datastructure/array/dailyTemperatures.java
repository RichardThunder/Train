package com.datastructure.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class dailyTemperatures {
public int[] dailyTemperatures(int[] temperatures) {
    int[] res = new int[temperatures.length];
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    Stack<int[]> stack = new Stack<int[]>();

    for (int i = temperatures.length - 1; i >= 0; i--) {
        int num = temperatures[i];

        while (!stack.isEmpty() && num >= stack.peek()[1]) {
            stack.pop();
        }
        map.put(i, stack.isEmpty() ? -1 : stack.peek()[0]);
        stack.push(new int[]{i, num});
    }
    for (int i = 0; i < temperatures.length; i++) {
        if (map.get(i) - i > 0) {
            res[i] = map.get(i) - i;
        }
        else {
            res[i] = 0;

        }
        // if(map.get(temperatures[i])==-1){
        //     res[i]=0;
        // }
        // else{
        //     if(map.get(temperatures[i])-i<0)
        //         res[i]=0;
        //     else res[i]=map.get(temperatures[i])-i;
        // }
        // res[i]=map.get(temperatures[i])==-1 ?
        //                     0: map.get(temperatures[i])-i;
    }
    return res;
}
}
