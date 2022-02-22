package com.algorithms;
/*

public class twoSum {
private static int x_index=0;
public int[] twoSum(int[] numbers, int target) {
    // 从头遍历,直到T-num[n]<num[n]
    // n=0;x=Target-numbers[n];
    // while(n<x)
    // if(find(numbers,x,n+1)==TRUE)
    // break;
    // else {n++;x=Target-numbers[n];}
    //
    //从num[n]之后寻找x start=n+1 使用二分查找法
    // find(numbers,x,start){
    int n=0;
    int x=target-numbers[0];
    int[] array=new int[n];
    while(numbers[n]<=x){//如果有两个相同的数且相加为答案,此时为=
        if(findX(numbers,x,n+1)){
            array[0]=n+1;
            array[1]=x_index+1;
            break;
        }
        else {
            n++;
            x=target-numbers[n];
        }
    }
    return array;
}
public boolean findX(int[] numbers,int x, int start){//二分查找法
    int head=start;
    int tail=numbers.length-1;
    while (head<=tail){//<= 此时head=tail
        int middle=head+(tail-head)/2;
        if(x>numbers[middle]){
            head=middle+1;
        }
        else  if (x==numbers[middle])
        {
            x_index=middle;
            return true;
        }
        else tail=middle-1;
    }
    return false;
}
}
*/

/*
class Solution {
public int[] twoSum(int[] numbers, int target) {
int n=0;
int x=target-numbers[0];
    int tail=numbers.length-1;
while (numbers[n]<=x){
    int head=n+1;

    while(head<=tail){
        int middle=head+(tail-head)/2;
        if(x==numbers[middle]){
            int[] array=new int[2];
            array[0]=n+1;
            array[1]=middle+1;
            return array;
        }
        else if(x>numbers[middle])
            head=middle+1;
        else tail=middle-1;
    }
    n+=1;
    x=target-numbers[n];
}
    return new int[2];
}
}
*/

class twoSum {//双指针
public int[] twoSum(int[] numbers, int target) {
    int p1=0;
    int p2=numbers.length-1;
    while(p1<numbers.length-1) {
        while (p2 <= numbers.length - 1) {
            int sum = numbers[p1] + numbers[p2];
            if (sum == target) {
                return new int[] {p1+1,p2+1};
            }
            else if(sum>target) p2--;
            else break;
        }
        p1+=1;

    }
    return null;
}
}






































