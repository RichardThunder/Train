package com.Tree;

public class constructMaximumBinaryTree {
TreeNode constructMaximumBinaryTree(int[] nums) {
    int left = 0;
    int right = nums.length - 1;
    return traverse(nums, left, right);
}

TreeNode traverse(int[] nums, int left, int right) {
    if (left < right) {
        return null;
    }
    int max = nums[left];
    int index = left;//注意设定max时从数组中选择一个。 之前取max=0,i=-1在递归调用时出现了不明原因的栈溢出
    for (int i = left; i <= right; i++) {
        if (nums[i] > max) {
            max = nums[i];
            index = i;
        }
    }
    TreeNode root = new TreeNode(max);
    root.left = traverse(nums, left, index - 1);
    root.right = traverse(nums, index + 1, right);
    return root;
}
}
