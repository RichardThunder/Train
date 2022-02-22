package com.algorithms;

public class reverseString {
public void reverseString(char[] s) {
    int low=0;
    int high=s.length-1;
    while(low<high){
        // char temp=s[low];
        // s[low]=s[high];
        // s[high]=temp;
        // low++;high--;
        // s[low]= (char) (s[low]^s[high]); //出现编译错误
        // s[high]= (char) (s[low]^s[high]);
        // s[low]= (char) (s[low]^s[high]);
        s[low]^=s[high];
        s[high]^=s[low];
        s[low]^=s[high];
        low++;high--;
    }
}
}
