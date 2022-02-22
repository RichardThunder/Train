package com.algorithms;
import java.util.HashMap;
import java.util.Map;
public class lengthOfLongestSubstring {
// public int lengthOfLongestSubstring(String s) {
//     if (s.length() == 0)
//         return 0;
//     char[] chars = new char[s.length()];
//     chars = s.toCharArray();
//     int low = 0;
//     int max = 1;
//     for (; low < s.length(); low++) {
//         int high = low;
//         int n = 1;
//         while (high + 1 < s.length()) {
//             high += 1;
//             if (!isSame(low, high, n, chars)) {
//                 n += 1;
//             }
//             else
//                 break;
//             if (n > max)
//                 max = n;
//         }
//     }
//     return max;
// }
// public boolean isSame(int low, int high, int n, char[] chars) {
//     while (n > 0) {
//         if (chars[high - n] == chars[high])
//             return true;
//         else
//             n--;
//     }
//     return false;
// }
public int lengthOfLongestSubstring(String s) {//使用hashmap 滑动窗口
    int res = 0;
    int n = s.length();
    Map<Character, Integer> window = new HashMap<>();
    for (int low = 0, high = 0; high < n; high++) {
        if (window.containsKey(s.charAt(high))) {
            low = Math.max(window.get(s.charAt(high)), low);//跳过上个窗口,left更新到最新位置
        }
        res = Math.max(res, high - low + 1);//更新result
        window.put(s.charAt(high), high + 1);
    }
    return res;
}
}
