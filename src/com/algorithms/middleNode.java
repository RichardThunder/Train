package com.algorithms;

//Definition for singly-linked list.
public class middleNode {
public ListNode middleNode(ListNode head) {
    // ListNode[] L=new ListNode[100];
    // int i=0;
    // while (head != null) {
    //     L[i++]=head;
    //     head = head.next;
    // }
    // return L[i/2];
    ListNode Fast = head;
    ListNode Slow = head;
    while (Fast != null && Fast.next != null) {
        Fast = Fast.next.next;
        Slow = Slow.next;
    }
    return Slow;
}

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
}
