package com.bridgelabz;

public class BinarySearchTree {
    int size = 0;
    public Node insert(Node root, int value) { //create method for insert data

        if (root == null) {  //root is null go at leaf node
            return createNewNode(value);
        }

        /*
         * If value less than root data then it will print on left side
         */
        if (root.data < value) {
            root.left = insert(root.left, value);
            /*
             * If value is greater than root data then it will print on right side
             */
        } else if (root.data > value) {
            root.right = insert(root.right, value);
        }
        return root;
    }

    public Node createNewNode(int a) {
        Node bst = new Node(a);
        bst.data = a;
        bst.left = null;
        bst.right = null;
        size += 1;
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
    public int size() {
        return size;
    }
    public boolean search(Node root, int value) {
        if (root == null) {
            return false;
        }

        boolean isPresent = false;
        while (root != null) {
            if (root.data < value) {
                root = root.left;
            } else if (root.data > value) {
                root = root.right;
            } else {
                isPresent = true;
                break;
            }
        }

        return isPresent;
    }
}
