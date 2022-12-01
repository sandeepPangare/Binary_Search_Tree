package com.bridgelabz;

public class BinarySearchTreeMain {

    public static void main(String[] args) {
        System.out.println("Welcome to Binary Search Tree Program");
        BinarySearchTree bst = new BinarySearchTree(); //creating Class Object
        Node root = null;
        root = bst.insert(root, 56); //add data
        root = bst.insert(root, 30);
        root = bst.insert(root, 70);
        bst.print(root);
    }
}

