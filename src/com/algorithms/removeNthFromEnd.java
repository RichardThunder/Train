package com.algorithms;

public class removeNthFromEnd {
public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode fast=head;
    ListNode slow=head;
    if(head.next==null)
        return null;
    while(n--!=0){
        fast=fast.next;
    }
    if(fast==null)
        return head.next;
    fast=fast.next;
    while(fast!=null){
        fast=fast.next;slow=slow.next;
    }
    slow.next=slow.next.next;
    return head;
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

