package com.company;

public class Main {

    public static void main(String[] args) {

        AVL avl = new AVL();
        avl.insert(5);
        avl.insert(10);
        avl.insert(15);
        avl.insert(20);
        avl.levelOrder();
        System.out.println();
        avl.search(avl.root, 20);

        avl.delete(5);
        avl.levelOrder();
        System.out.println();

        avl.deleteAVL();
//        avl.levelOrder();
    }
}
