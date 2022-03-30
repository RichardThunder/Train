package com.datastructure.linkedList;

public class middleNode {
public ListNode middleNode(ListNode head) {
    ListNode fast=head;
    ListNode slow=head;
    while(fast.next!=null && fast.next.next!=null){
        fast=fast.next.next;
        slow=slow.next;
    }
    return slow;
}
}
