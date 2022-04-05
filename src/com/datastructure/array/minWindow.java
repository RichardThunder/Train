package com.datastructure.array;
//滑动窗口
//哈希表
//判断是否有效
//记录最小子串
//字符串
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class minWindow {
/*public String minWindow(String s, String t) {
    if (s.length() < t.length())
        return null;
    Map<Character, Integer> needed = new HashMap<Character, Integer>();
    Map<Character, Integer> window = new HashMap<Character, Integer>();
    char[] chars = s.toCharArray();
    char[] chart = t.toCharArray();
    //放入needed，map中
    for (char i : chart) {
        needed.put(i, needed.getOrDefault(i, 0) + 1);
    }
    int left = 0, right = 0, valid = 0;
    int start = 0,len=Integer.MAX_VALUE;//存储最小子串的开始，长度
    while (right < s.length()) {
        char c = chars[right];
        right += 1;
        //更新窗口内数据
        if (needed.containsKey(c)) {
            window.put(c, window.getOrDefault(c, 0) + 1);
            if (window.get(c).equals(needed.get(c)))
                valid++;
        }
        //判断是否要开始收缩窗口
        while(needed.size()==valid){
            //记录最小子串
            if(right-left<len){
                start=left;
                len = right - left;
            }
            //删除窗口左侧,收缩窗口
            char delete=chars[left];
            left++;
            //如果needed中包含delete，那么需要对valid行更新
            if(needed.containsKey(delete)){
                if(Objects.equals(window.get(delete), needed.get(delete)))//如果删除的那个是最后一个
                    valid--;//有一个字符不符合
                window.put(delete,window.get(delete)-1);
            }
        }
    }
    return len==Integer.MAX_VALUE ? "" : s.substring(start,start+len);
}*/
public String minWindow(String s, String t) {
    //needmap,window map
    //滑动窗口，
    if (s.length() < t.length())
        return "";
    int left = 0, right = 0, valid = 0;
    int start = 0, len = Integer.MAX_VALUE;
    Map<Character, Integer> needed = new HashMap<Character, Integer>();
    Map<Character, Integer> window = new HashMap<Character, Integer>();
    for (int i = 0; i < t.length(); i++) {
        needed.put(t.charAt(i), needed.getOrDefault(t.charAt(i), 0) + 1);
    }
    while (right < s.length()) {
        //向右扩展
        //window.put(s.charAt(right),window.getOrDefault(s.charAt(right),0)+1);
        char c = s.charAt(right);
        right++;
        //right 是不是满足所需的，如果是,向window中更新数量，如果满足valid相等，开始缩小窗口
        if (needed.containsKey(c)) {
            window.put(c, window.getOrDefault(c, 0) + 1);//更新windows map 中的有效数量
            if (needed.get(c).equals(window.get(c))) {//有一个字符的数量满足了
                valid++;
            }
        }
        //当全部满足时开始收缩
        while (needed.size() == valid) {
            if (right - left < len) {
                start = left;
                len = right - left;
            }
            //收缩windows
            char l = s.charAt(left);
            left++;
            //当且仅当l 是needed中的字符是才对window 进行删减
            if (needed.containsKey(l)) {
                window.put(l, window.get(l) - 1);
                if (window.get(l) < needed.get(l)) {
                    valid--;
                }
            }
            //更新valid
        }
    }
    return len == Integer.MAX_VALUE ? "" : s.substring(start, start + len);
}
}