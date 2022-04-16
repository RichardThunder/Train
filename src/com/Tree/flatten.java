package com.Tree;

import java.util.ArrayList;
import java.util.List;


public class flatten {

public void flatten(TreeNode root) {
    List<TreeNode> res = new ArrayList<>();
    traverse(root, res);
    for (int i = 1; i < res.size(); i++) {
        TreeNode pre = res.get(i - 1);
        TreeNode cur = res.get(i);
        pre.left = null;
        pre.right = cur;

    }

}

void traverse(TreeNode root, List<TreeNode> list) {
    if (root == null)
        return;
    list.add(root);
    traverse(root.left, list);
    traverse(root.right, list);
}
}
