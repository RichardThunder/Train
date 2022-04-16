package com.Tree;


class Node {
public int val;
public Node left;
public Node right;
public Node next;

public Node() {
}

public Node(int _val) {
    val = _val;
}

public Node(int _val, Node _left, Node _right, Node _next) {
    val = _val;
    left = _left;
    right = _right;
    next = _next;
}
};

public class connect {
//使用层序遍历
// public Node connect(Node root) {
//     if(root==null) return  null;
//     Queue<Node> q=new LinkedList<>();
//     q.offer(root);
//     while(!q.isEmpty()){
//
//         int size=q.size();//确保只遍历这一层；
//         Node pre=null;
//         Node curr=null;
//         for(int i=0;i<size;i++){//只遍历到右侧倒数第二个节点
//             curr=q.poll();
//             if(pre!=null) pre.next=curr;
//             if(curr.left!=null) q.offer(curr.left);
//             if(curr.right!=null) q.offer(curr.right);
//             pre=curr;
//         }
//         // //把最右侧节点取出不做任何处理，
//         // Node last=q.poll();
//         // pre.next=last;
//         // if(last.left!=null) q.offer(last.left);
//         // if(last.right!=null) q.offer(last.right);
//     }
//     return root;
// }

public Node connect(Node root) {
    if (root == null)
        return null;
    if (root.left != null) {
        root.left.next = root.right;
        if (root.next != null) {
            root.right.next = root.next.left;
        }

    }
    connect(root.left);
    connect(root.right);
    return root;
}


}
