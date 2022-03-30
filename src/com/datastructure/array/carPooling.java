package com.datastructure.array;

public class carPooling {
int[] diff=new int[1000];
public boolean carPooling(int[][] trips, int capacity) {
   /* int[] routine=new int[1000];
    for(int[] station : trips){
        for(int  i=station[1];i<=station[2]-1;i++)//注意在到达站下车，所以乘坐人数只加到上一站
        {routine[i]+=station[0];
            if(routine[i]>capacity)
                return false;
        }
    }
    return true;*/
for(int[] station : trips){//查分数组
    diff[station[1]]+=station[0];
    diff[station[2]]-=station[0];
}
int passenger=diff[0];
for(int num : diff){
    passenger+=num;
    if(passenger>capacity)
        return false;
}
return true;
}
}
