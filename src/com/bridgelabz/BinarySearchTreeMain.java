package com.bridgelabz;

public class BinarySearchTreeMain {

    public static void main(String[] args) {
        System.out.println("Welcome to Binary Search Tree Program");
        BinarySearchTree bst = new BinarySearchTree(); //creating Class Object
        Node root = null;
        root = bst.insert(root, 56); //add data
        root = bst.insert(root, 30);
        root = bst.insert(root, 70);
        root = bst.insert(root, 22);
        root = bst.insert(root, 40);
        root = bst.insert(root, 60);
        root = bst.insert(root, 95);
        root = bst.insert(root, 11);
        root = bst.insert(root, 65);
        root = bst.insert(root, 3);
        root = bst.insert(root, 16);
        root = bst.insert(root, 63);
        root = bst.insert(root, 67);

        bst.print(root);
        System.out.println();
        System.out.println("Number of Nodes in binary tree: " + bst.size());
        System.out.println("Search 63 in BST: "+ bst.search(root,63));
    }
}

