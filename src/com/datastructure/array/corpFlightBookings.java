package com.datastructure.array;

public class corpFlightBookings {
public int[] corpFlightBookings(int[][] bookings, int n) {
    int[] diff=new int[n+2];
    for(int[] record : bookings){

        diff[record[0]]+=record[2];
        diff[record[1]+1]-=record[2];
    }

    int[] answer=new int[n];
    answer[0]=diff[1];
    for(int i=1;i<n;i++){
        answer[i]=answer[i-1]+diff[i+1];
    }
    return answer;
}
}
