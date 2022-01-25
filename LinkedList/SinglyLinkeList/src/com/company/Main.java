package com.company;

public class Main {

    public static void main(String[] args) {
	    SinglyLinkedList sll = new SinglyLinkedList();
        sll.createSinglyLinkedList(5);
//        System.out.println(sll.head.value);

        sll.insertInLinkedList(6,1);
        sll.insertInLinkedList(7,3);
        sll.insertInLinkedList(8,4);
        sll.insertInLinkedList(9,0);
        sll.traverse();
//        sll.searchNode(60);
//        sll.deleteNode(6);
        sll.deleteSinglyLinkedList();
        sll.traverse();
    //        System.out.println(sll.head.next.next.value);

    }
}
