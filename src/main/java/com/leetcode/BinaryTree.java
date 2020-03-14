package com.leetcode;

/**
 * Created by chou on 2020/3/11.
 */
public class BinaryTree {
    int data;
    BinaryTree left;
    BinaryTree right;

    public BinaryTree(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }


    public void insert(int num){
        if (data < num) {
            if (right == null) {
                right = new BinaryTree(num);
            } else {
                right.insert(num);
            }
        } else {
            if (left == null) {
                left = new BinaryTree(num);
            } else {
                left.insert(num);
            }
        }
    }


    //中序遍历
    public void in(BinaryTree tree) {
        if (tree != null) {
            in(tree.left);
            System.out.print(tree.data+" ");
            in(tree.right);
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 5, 9, 8, 1, 2, 3, 10, 4};
        BinaryTree root = new BinaryTree(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            root.insert(arr[i]);
        }

        root.in(root);
    }



}
