package com.company;

public class Main {

    public static void main(String[] args) {
        BinaryTreeLL binaryTree = new BinaryTreeLL();

        binaryTree.insert("N1");
        binaryTree.insert("N2");
        binaryTree.insert("N3");
        binaryTree.insert("N4");
        binaryTree.insert("N5");
        binaryTree.insert("N6");
        binaryTree.insert("N7");
//        binaryTree.preOrder(binaryTree.root);
//        System.out.println();
//        binaryTree.inOrder(binaryTree.root);
//        System.out.println();
//        binaryTree.postOrder(binaryTree.root);
//        System.out.println();
        binaryTree.levelOrder();
        System.out.println();

//        binaryTree.search("N5");

        System.out.println(binaryTree.getDeepestNode().value);
        binaryTree.deleteNode("N3");

        binaryTree.levelOrder();
        System.out.println();

        binaryTree.deleteTree();
    }
}
