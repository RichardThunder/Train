package com.algorithms;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class checkInclusion {
// public boolean checkInclusion(String s1, String s2) {//haspmap+滑动窗口
//     int n1 = s1.length(), n2 = s2.length();
//     Map<Character, Integer> map = new HashMap<>();
//     for (int i = 0; i < n1; i++) {//初始化map
//         if (map.containsKey(s1.charAt(i)))
//             map.put(s1.charAt(i), map.get(s1.charAt(i)) +1);
//         else
//             map.put(s1.charAt(i), 1);
//     }
//     System.out.println(map);
//     // 确定窗口大小为n1-1
//     int left = 0;
//     int right = left + n1 - 1;
//     while (right < n2) {
//         Map<Character, Integer> map2 = new HashMap<>();
//         for (int i = 0; i < n1; i++) {
//             if (map2.containsKey(s2.charAt(left + i)))
//                 map2.put(s2.charAt(left + i), map2.get(s2.charAt(left + i)) + 1);
//             else
//                 map2.put(s2.charAt(left + i), 1);
//         }
//         if (map2.equals(map)) {
//             return true;
//         }
//         left++;
//         right++;
//         System.out.println(map2);
//     }
//     return false;
// 执行用时：
//         1385 ms
// , 在所有 Java 提交中击败了
// 5.00%
// 的用户
// 内存消耗：
//         41.6 MB
// , 在所有 Java 提交中击败了
// 5.03%
// 的用户
// 通过测试用例：
//         107 / 107
// }
/*
public boolean checkInclusion(String s1, String s2) {
    int n1 = s1.length(), n2 = s2.length();
    int[] map1=new int[128];
    for(int i=0;i<n1;i++){
        map1[s1.charAt(i)]+=1;
    }
    Map<Character, Integer> map = new HashMap<>();
    for(int left=0,right=left+n1-1; right<n2;left++,right++) {
        int[]map2=new int[128];
        for(int i=0;i<n1;i++){
            map2[s2.charAt(left+i)]+=1;
        }
        if(Arrays.equals(map1, map2))
            return true;
    }
    return false;
    // 执行用时：
    // 92 ms
    //         , 在所有 Java 提交中击败了
    // 12.79%
    //         的用户
    // 内存消耗：
    // 41.5 MB
    //         , 在所有 Java 提交中击败了
    // 6.92%
    //         的用户
    // 通过测试用例：
    // 107 / 107



}*/

public boolean checkInclusion(String s1, String s2) {
    if (s1.length() > s2.length())
        return false;
    Map<Character, Integer> needed = new HashMap<Character, Integer>();
    Map<Character, Integer> window = new HashMap<Character, Integer>();
    int left = 0, right = 0, valid = 0;
    for (int i = 0; i < s1.length(); i++) {
        needed.put(s1.charAt(i), needed.getOrDefault(s1.charAt(i), 0) + 1);
    }
    //窗口不断右移，直到包含的数目与needed中相同
    //收缩左边，直到大小与s1相同
    //移动窗口
    while(right < s2.length()){
        char r=s2.charAt(right);
        right++;

        if(needed.containsKey(r)){
            window.put(r,window.getOrDefault(r,0)+1);
            if(needed.get(r).equals(window.get(r)))
                valid++;

        }
        //window中的字符满足需要此时收缩左边
        while(needed.size() == valid){
            if(right-left==s1.length()){
                return true;
            }
            char l=s2.charAt(left);
            left++;
            if(needed.containsKey(l)){
                window.put(l, window.get(l)-1);
                if(window.get(l)<needed.get(l))
                    valid--;
            }
        }

    }
return false;
}
/*执行结果：
通过

执行用时：
        22 ms
, 在所有 Java 提交中击败了
34.75%
的用户
内存消耗：
        41.3 MB
, 在所有 Java 提交中击败了
33.53%
的用户
通过测试用例：
        107 / 107*/
}
















