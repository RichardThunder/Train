package com.Tree;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class maxDepth {
int depth=0;
int result=0;
public int maxDepth(TreeNode root) {
    traverse(root);
    return  result;
}
void traverse(TreeNode root){
if(root==null) {
    result=Math.max(depth,result);
    return;
}
depth++;
traverse(root.left);
traverse(root.right);
depth--;
}

}
