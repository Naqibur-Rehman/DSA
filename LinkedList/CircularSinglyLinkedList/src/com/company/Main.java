package com.company;

public class Main {

    public static void main(String[] args) {
        CircularSLL csll = new CircularSLL();
        csll.createCSLL(5);
        csll.insertCSLL(4,0);
        csll.insertCSLL(6,1);
        csll.insertCSLL(3,8);
        System.out.println(csll.head.value);
        System.out.println(csll.head.next.value);

        csll.traverse();

//        csll.searchNode(5);
//        csll.searchNode(9);

//        csll.deleteNode(2);
//        csll.traverse();
//        csll.deleteNode(3);
//        csll.traverse();
//        csll.deleteNode(0);
//        csll.traverse();

        csll.deleteCSLL();
        csll.traverse();

    }
}
