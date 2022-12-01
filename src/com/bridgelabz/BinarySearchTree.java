package com.bridgelabz;

public class BinarySearchTree {

    public Node insert(Node root, int value) {

        if (root == null) {  //root is null go at leaf node
            return createNewNode(value);
        }

        /*
         * If value less than root data then it will print on left side
         */
        if (root.data > value) {
            root.left = insert(root.left, value);
            /*
             * If value is greater than root data then it will print on right side
             */
        } else if (root.data < value) {
            root.right = insert(root.right, value);
        }
        return root;
    }

    public Node createNewNode(int a) {
        Node bst = new Node();
        bst.data = a;
        bst.left = null;
        bst.right = null;
        return bst;
    }

    public void print(Node root) { //For Print

        if (root == null) {
            return;
        }
        print(root.left); //To check left root are null
        System.out.println(root.data);
        print(root.right);//To check right root are null
    }
}
