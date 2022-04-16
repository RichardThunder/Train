package com.Tree;

import java.util.LinkedList;
import java.util.List;

//给你二叉树的根节点 root ，返回它节点值的 前序 遍历。
public class preorderTraversal {
private List<Integer> res = new LinkedList<>();

public List<Integer> preorderTraversal(TreeNode root) {
    traverse(root);
    return res;
}

public void traverse(TreeNode root) {
    if (root == null)
        return;
    //在前序位置添加节点
    res.add(root.val);
    traverse(root.left);
    traverse(root.right);
}
}
