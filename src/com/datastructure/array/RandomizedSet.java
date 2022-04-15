package com.datastructure.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class RandomizedSet {
HashMap<Integer, Integer> valToIndex;
Random random;
private List<Integer> list;

public RandomizedSet() {
    list = new ArrayList<>();
    valToIndex = new HashMap<>();
    random = new Random();
}

public boolean insert(int val) {
    if (valToIndex.containsKey(val))
        return false;
    else {
        list.add(val);
        valToIndex.put(val, list.size() - 1);
        return true;
    }
}

public int getRandom() {
    return (list.get(random.nextInt(list.size())));
}

public boolean remove(int val) {
    if (valToIndex.containsKey(val)) {
        //把目标值的index位置替换为list尾部，然后更新替换后的目标位置hashmap，list去除尾部，hashmap去除val；
        int index = valToIndex.get(val);
        int last = list.get(list.size() - 1);
        list.set(index, last);
        valToIndex.put(last, index);
        valToIndex.remove(val);
        list.remove(list.size() - 1);

        return true;
    }
    else
        return false;
}


}
