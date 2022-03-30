package com.datastructure.linkedList;
import com.algorithms.middleNode;
class mergeTwoLists {
/*public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    if (list1 == null && list2 == null)
        return list1;
    else if (list1 == null)
        return list2;
    else if (list2 == null)
        return list1;
    if (list1.val > list2.val) {
        ListNode tmlist = list1;
        list1 = list2;
        list2 = tmlist;
    }
    ListNode p1 = list1;
    ListNode p2 = list1;
    list1 = list1.next;
    while (list1 != null || list2 != null) {

        if (list1.val < list2.val) {
            p1.next = list1;
            list1 = list1.next;
            p1 = p1.next;
        }
        else {
            p1.next = list2;
            list2 = list2.next;
            p1 = p1.next;
        }
    }
    if (list1 == null) {
            p1.next = list2;
            break;
        }
        if (list2 == null) {
            p1.next = list1;
            break;
        }
    return p2;
}*/
public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

 ListNode dump=new ListNode(-1),p=dump;
 ListNode p1=list1,p2=list2;
 while (p1!=null && p2!=null){
     if(p1.val<p2.val){
         p.next=p1;
         p1=p1.next;
     }
     else{p.next=p2;p2=p2.next;}
     p=p.next;
 }
 if(p1!=null)
     p.next=p1;
 if(p2!=null)
     p.next=p2;
 return dump.next;



}
}
class ListNode {
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
