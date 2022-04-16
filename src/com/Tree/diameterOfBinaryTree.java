package com.Tree;

public class diameterOfBinaryTree {
/*
int maxDiameter=0;
public int diameterOfBinaryTree(TreeNode root) {
    traverse(root);
    return maxDiameter;
}
void traverse(TreeNode root){
    if(root==null) return;
    int leftMax=maxDepth(root.left);
    int rightMax=maxDepth(root.right);
    int diameter=leftMax+rightMax;

    maxDiameter=Math.max(maxDiameter,diameter);

    traverse(root.left);
    traverse(root.right);
}

int maxDepth(TreeNode root){
    if(root==null) return 0;
    int leftMax=maxDepth(root.left);
    int rightMax=maxDepth(root.right);
    return 1+Math.max(leftMax,rightMax);
}*/
int maxdiameter=0;
public int diameterOfBinaryTree(TreeNode root) {
    maxDepth(root);
    return maxdiameter;

}

int maxDepth(TreeNode root){
    if(root==null) return 0;
    int leftMax=maxDepth(root.left);
    int rightMax=maxDepth(root.right);
    maxdiameter=Math.max(maxdiameter,leftMax+rightMax);
    return 1+Math.max(leftMax,rightMax);
}

}
