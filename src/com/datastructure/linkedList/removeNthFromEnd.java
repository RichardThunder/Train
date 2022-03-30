package com.datastructure.linkedList;

import java.util.List;

public class removeNthFromEnd {
public ListNode removeNthFromEnd(ListNode head, int n) {
    if(head == null) return null;
    ListNode dump = new ListNode(-1);
    dump.next=head;
    ListNode p=dump;
    ListNode fast=dump;
    ListNode slow=dump;
    //快指针先走n步
    for(int i=0; i<n; i++) {
        fast=fast.next;
    }
    while(fast.next!=null){
        fast=fast.next;
        slow=slow.next;
    }
    slow.next=slow.next.next;
    return dump.next;


}
}
