package com.company;

public class LinkedList {
    public Node head;
    public Node tail;
    public int size;

    // create Linked List
    public void createLL(int nodeValue) {
        Node newNode  = new Node();
        newNode.value = nodeValue;
        newNode.next = null;
//        newNode.prev = null;
        head = newNode;
        tail = newNode;
        size = 1;
    }

    // insert method
    public void insertNode(int nodeValue) {
        if (head == null) {
            createLL(nodeValue);
            return;
        }
        Node newNode = new Node();
        newNode.value = nodeValue;
        newNode.next = null;
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    // traverse Linked List
    public void traverseLL() {
        Node tempNode = head;
        for (int i = 0; i < size; i++) {
            System.out.print(tempNode.value);
            if (i != size -1) {
                System.out.print(" -> ");
            }
            tempNode = tempNode.next;
        }
        System.out.println();
    }
}
