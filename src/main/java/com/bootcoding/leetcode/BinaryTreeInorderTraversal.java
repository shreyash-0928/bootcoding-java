package com.bootcoding.leetcode;

import java.util.*;

public class BinaryTreeInorderTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);
        TreeNode n7 = new TreeNode(7);
        TreeNode n8 = new TreeNode(8);
        TreeNode n9 = new TreeNode(9);
        TreeNode n10 = new TreeNode(10);
        TreeNode n11 = new TreeNode(11);
        TreeNode n12 = new TreeNode(12);
        TreeNode n13 = new TreeNode(13);
        TreeNode n14 = new TreeNode(14);
        TreeNode n15 = new TreeNode(15);
        TreeNode n16 = new TreeNode(16);
        TreeNode n17 = new TreeNode(17);

        root.left = n2;
        root.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.left = n6;
        n3.right = n7;
        n4.left = n8;
        n4.right = n9;
        n5.left = n10;
        n5.right = n11;
        n6.left = n12;
        n6.right = n13;
        n7.left = n14;
        n7.right = n15;
        n8.left = n16;
        n8.right = n17;
//        TreeNode root = new TreeNode(1);
//        TreeNode n2 = new TreeNode(2);
//        TreeNode n3 = new TreeNode(3);
//
//        root.right = n2;
//        n2.left = n3;

        List arr = inorderTraversal(root);
        for (int i = 0 ; i < arr.size();i++){
            System.out.println(arr.get(i));
        }

    }
    static List<Integer> values = new  LinkedList<>();
    public static List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return values;
        }
        inorderTraversal(root.left);
        values.add(root.val);
        inorderTraversal(root.right);
        return values;
    }
}
