package com.BTS;

import java.util.LinkedList;
import java.util.Queue;
//层序遍历
public class levelTraverse {
void levelTraverse(TreeNode root) {
    Queue<TreeNode> qs= new LinkedList<>();
    if(root==null) return ;
    qs.offer(root);
    while(!qs.isEmpty()){
        int size = qs.size();
        for(int i=0; i<size; i++){
            TreeNode curr = qs.poll();
            if(curr.left!=null) qs.offer(curr.left);
            if(curr.right!=null) qs.offer(curr.right);
        }
    }
}
}
