package com.datastructure.linkedList;

import com.algorithms.removeNthFromEnd;

public class detectCycle {
public ListNode detectCycle(ListNode head) {
    if(head==null || head.next==null)
        return null;
    ListNode fast = head;
    ListNode slow=head;
    while(fast!=null&&fast.next!=null){
        fast=fast.next.next;
        slow=slow.next;
        if(slow==fast)
            break;
    }
    if(fast==null||fast.next==null)
        return null;
    slow=head;
    while(slow!=fast){
        fast=fast.next;
        slow=slow.next;

    }
    return slow;
}
}
