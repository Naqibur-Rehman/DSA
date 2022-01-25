package com.company;

public class Main {

    public static void main(String[] args) {

        CircularDoublyLinkedList cdll = new CircularDoublyLinkedList();
        cdll.createCDLL(1);
//        System.out.println(cdll.head.value);
        cdll.insertCDLL(2,0);
        cdll.insertCDLL(3,2);
        cdll.insertCDLL(4,5);
        cdll.traverseCDLL();
        cdll.reverseTraverseCDLL();
        cdll.searchNode(2);
        cdll.searchNode(9);
        cdll.deleteNode(2);
//        cdll.traverseCDLL();
        cdll.deleteCDLL();
        cdll.traverseCDLL();
//        System.out.println(cdll.head.next.value);

    }
}
