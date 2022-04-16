package com.Tree;

import java.util.HashMap;
import java.util.Map;

public class buildTree {
Map<Integer, Integer> preMap;
Map<Integer, Integer> inMap;

public TreeNode buildTree(int[] preorder, int[] inorder) {
    //确定2个hashtable，显然，pre的第一个节点为root. 第二个节点为左子树的root。
    //在inorder中找到根root， 分割数组为左右子树
    //右子树的根节点为前序右子树部分的第一个节点。
    //递归实现寻找左右子树的根节点
    preMap = new HashMap<>();
    inMap = new HashMap<>();
    int n = preorder.length;

    for (int i = 0; i < n; i++) {
        preMap.put(preorder[i], i);
        inMap.put(inorder[i], i);
    }
    return build(preorder, 0, n - 1, inorder, 0, 1);

}
/*
TreeNode build(int[] preorder,int p_l,int p_r,int[]inorder,int i_l,int i_r){
    if(p_l>p_r || i_l>i_r) return null;

    //root_indexP=p_l;
    TreeNode root= new TreeNode(preorder[p_l]);
    int root_indexOfInorder=inMap.get(preorder[p_l]);

    //preorder index
    int left_P_Start=p_l+1;
    int left_P_End= preMap.get(inorder[root_indexOfInorder-1]);
    int right_P_Start=left_P_End+1;
    int right_P_End=p_r;
    //inorder index
    int left_I_Start=i_l;
    int left_I_End=root_indexOfInorder-1;
    int right_I_Start=root_indexOfInorder+1;
    int right_I_End=i_r;



    root.left=build(preorder, left_P_Start,left_P_End ,
                    inorder,left_I_Start ,left_I_End );
    root.right=build(preorder, right_P_Start,right_P_End ,
                    inorder,right_I_Start ,right_I_End );
    return root;
}

*/

TreeNode build(int[] preorder, int p_Start, int p_End, int[] inorder, int i_Start, int i_End) {
    if (p_Start > p_End)
        return null;

    int root_PreIndex = p_Start;
    int rootVal = preorder[root_PreIndex];
    TreeNode root = new TreeNode(rootVal);
    int leftSize = inMap.get(rootVal) - i_Start;


    root.left = build(preorder, p_Start + 1, p_Start + leftSize, inorder, i_Start, inMap.get(rootVal) - 1);
    root.right = build(preorder, p_Start + leftSize + 1, p_End, inorder, inMap.get(rootVal) + 1, i_End);
    return root;
}

}