package com.datastructure.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class findAnagrams {
public List<Integer> findAnagrams(String s, String p) {
    List<Integer> sublist=new ArrayList<Integer>();
    if (p.length() > s.length())
        return sublist;

    Map<Character, Integer> needed = new HashMap<Character, Integer>();
    Map<Character, Integer> window = new HashMap<Character, Integer>();
    int left = 0, right = 0, valid = 0;
    //load P->need_Mqp
    for (int i = 0; i < p.length(); i++) {
        needed.put(p.charAt(i), needed.getOrDefault(p.charAt(i), 0) + 1);
    }
    //window
while(right<s.length()){
    char r=s.charAt(right);
    right++;

    if(needed.containsKey(r)){
        window.put(r, window.getOrDefault(r,0)+1);
        if(needed.get(r).equals(window.get(r))){
            valid++;
        }
    }
    //shunk when WinLength > p
    /*while(right-left>=p.length()){//时刻保持大小刚好
        if(valid==needed.size()){
            sublist.add(left);
        }
        char l=s.charAt(left);
        left++;
        if(needed.containsKey(l)){
            if(window.get(l).equals( needed.get(l)))//Map 中超过128的数字通过对象来存储，所以不能通过==来判断
                valid--;
            window.put(l, window.get(l) - 1);
        }

    }*/
    while(valid==needed.size()){
        if(right-left == p.length() ){
            sublist.add(left);
        }
        char l=s.charAt(left);
        left++;
        if(needed.containsKey(l)){
            window.put(l, window.get(l) - 1);
            if(window.get(l) < needed.get(l))
                valid--;
        }
    }
}
return sublist;
}
}
