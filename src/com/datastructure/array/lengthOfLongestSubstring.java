package com.datastructure.array;

import java.util.HashMap;
import java.util.Map;

public class lengthOfLongestSubstring {
public int lengthOfLongestSubstring(String s) {
    /*if(s==null) return 0;
    Map<Character,Integer> window= new HashMap<Character,Integer>();
    int left=0,right=0,Maxlength=0;
    while(right<s.length()) {
        char r = s.charAt(right);
        window.put(r, window.getOrDefault(r, 0) + 1);
        if (window.get(r) == 1) {
            Maxlength = Math.max(Maxlength, right - left + 1);
            right++;
        }
        //出现重复，left++++直到重复的元素被发现,left更新到上次出现的下一个元素的位置
        if(window.get(r)>1) {
            while (s.charAt(left) != r) {
                window.put(s.charAt(left), window.get(s.charAt(left))-1);
                left++;
            }
            window.put(s.charAt(left), window.get(s.charAt(left))-1);
            left+=1;
            right++;
        }
    }
    return Maxlength;*/
    Map<Character, Integer> window = new HashMap<Character, Integer>();
    int right = 0, left = 0, Maxlength = 0;
    while (right < s.length()) {
        if (window.containsKey(s.charAt(right))) {
            left = Math.max(left, window.get(s.charAt(right)) + 1);//left移到上次出现的下一个位置
        }
        window.put(s.charAt(right), right);
        Maxlength = Math.max(Maxlength, right - left + 1);
        right++;
    }
    return Maxlength;
}
}
