package com.datastructure.linkedList;

public class reverseList {
public ListNode reverseList(ListNode head) {
if(head == null||head.next==null) return head;
    ListNode last=reverseList(head.next);
    head.next.next=head;
    head.next=null;
    return last;
}
ListNode successor=null;//successor是递归尾部的下一个节点，最后用于连接反转后的节点
ListNode reverseN(ListNode head, int n) {
    if(n==1){
        successor=head.next;
        return head;
    }
    ListNode last=reverseN(head.next,n-1);
    head.next.next=head;
    head.next=successor;//与剩余节点连接
    return last;
}
ListNode reverseBetween(ListNode head, int m, int n) {
if (m==1){
    return reverseN(head,n);
}
head.next=reverseBetween(head.next,m-1,n-1);
return head;
}
ListNode reverseKGroup(ListNode head, int k){
if(head==null) return null;
ListNode a,b;
a=b=head;
for(int i=0;i<k;i++){
    if(b==null) return head;
    b=b.next;
}
ListNode newHead=reverse(a,b);//head=b
a.next=reverseKGroup(b,k);//connet
return newHead;
}

ListNode reverse(ListNode a,ListNode b) {
    ListNode pre = null, curr = a;
    while (curr != b) {
        ListNode temp = curr.next;
        curr.next = pre;
        pre = curr;
        curr = temp;
    }
    return pre;
}
}
