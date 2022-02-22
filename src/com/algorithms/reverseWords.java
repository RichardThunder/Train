package com.algorithms;

// public class reverseWords {
// public String reverseWords(String s) {
//     char[] charArr=s.toCharArray();
//     int low=0;
//     int high=1;
//     while(high<=charArr.length-1) {
//
//         if (charArr[low] != ' ') {
//             if (charArr[high] == ' ') {
//                 reverse(low, high - 1, charArr);
//                 low = high + 1;
//                 high = low + 1;
//             }
//             else high++;
//         }
//         else {low++;high++;}
//     }
//     reverse(low,high-1,charArr);//最后一个单词没有空格识别不到
//     return String(charArr);
// }
//     public void reverse(int low, int high,char[] charArr) {
//         while(low<high){
//
//             charArr[low]^=charArr[high];
//             charArr[high]^=charArr[low];
//             charArr[low]^=charArr[high];
//             low++;high--;
//         }
//
//     }
// }

public class reverseWords {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        for (String str : s.trim().split(" ")) {
            char[] chars = str.toCharArray();
            //reverse(chars);
            ans.append(chars).append(" ");
        }
        return ans.toString().trim();
    }
}
