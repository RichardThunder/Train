package com.datastructure.linkedList;

import java.util.Comparator;
import java.util.PriorityQueue;

public class mergeKLists {
public ListNode mergeKLists(ListNode[] lists) {
    if (lists.length == 0)
        return null;
    //虚拟头结点
    ListNode dump = new ListNode(-1);
    ListNode p = dump;
    PriorityQueue<ListNode> pq = new PriorityQueue<ListNode>(lists.length, new Comparator<ListNode>() {
        @Override
        public int compare(ListNode o1, ListNode o2) {
            return o1.val - o2.val;
        }
    });
    for (ListNode head : lists) {
        if (head != null)
            pq.add(head);
    }
    while (!pq.isEmpty()) {
        ListNode node = pq.poll();
        p.next = node;
        if (node.next != null) {
            pq.add(node.next);
        }
        p = p.next;
    }
    return dump.next;

}
}


