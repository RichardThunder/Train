package com.datastructure.linkedList;

public class isPalindrome {
ListNode left;
public boolean isPalindrome(ListNode head) {
left=head;
return traverse(head);
}
boolean traverse(ListNode head){
    if(head==null) return true;
    boolean result=traverse(head.next);
    result=result && (left.val==head.val);
    left=left.next;
    return result;
}
}
