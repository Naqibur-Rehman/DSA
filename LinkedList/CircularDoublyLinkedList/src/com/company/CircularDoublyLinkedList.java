package com.company;

public class CircularDoublyLinkedList {
    public DoublyNode head;
    public DoublyNode tail;
    public int size;

    // create circular DLL
    public DoublyNode createCDLL(int nodeValue) {
        head = new DoublyNode();
        DoublyNode newNode = new DoublyNode();
        newNode.value = nodeValue;
        head = tail = newNode;
        newNode.next = newNode;
        newNode.prev = newNode;
        size = 1;
        return head;
    }

    // Insertion Method
    public void insertCDLL(int nodevalue, int location) {
        DoublyNode newNode  = new DoublyNode();
        newNode.value = nodevalue;
        if (head == null) {
            createCDLL(nodevalue);
        } else if (location == 0) {
            newNode.next = head;
            newNode.prev = tail;
            head.prev = newNode;
            tail.next = newNode;
            head = newNode;
        } else if (location >= size) {
            newNode.next = head;
            newNode.prev = tail;
            head.prev = newNode;
            tail.next = newNode;
            tail = newNode;
        } else {
            DoublyNode tempNode = head;
            int index = 0;
            while (index < location-1) {
                tempNode = tempNode.next;
                index++;
            }
            newNode.prev = tempNode;
            newNode.next = tempNode.next;
            tempNode.next = newNode;
            newNode.next.prev = newNode;
        }
        size++;
    }

    // Traverse CDLL
    public void traverseCDLL() {
        if (head != null) {
            DoublyNode tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i != size-1) {
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }
        }else {
            System.out.println("CDLL does not exist");
        }
        System.out.println();
    }

    // Reverse Traverse CDLL
    public void reverseTraverseCDLL() {
        if (head != null) {
            DoublyNode tempNode = tail;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i != size-1) {
                    System.out.print(" <- ");
                }
                tempNode = tempNode.prev;
            }
        }else {
            System.out.println("CDLL does not exist");
        }
        System.out.println();
    }

    // Search for a node Method
    public boolean searchNode(int nodeValue) {
        if (head != null) {
            DoublyNode tempNode = head;
            for (int i = 0; i < size; i++) {
                if (tempNode.value == nodeValue) {
                    System.out.println("The node found at location " + i);
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Node not found");
        return false;
    }


    // Delete node Method
    public void deleteNode(int location) {
        if (head == null) {
            System.out.println("The CDLL does not exist");
            return;
        } else if (location == 0) {
            if (size == 1){
                head.prev = null;
                head.next = null;
                head = tail = null;
                size--;
                return;
            } else {
                head = head.next;
                head.prev = tail;
                tail.next = head;
                size--;
            }
        } else if (location >= size) {
            if (size == 1){
                head.prev = null;
                head.next = null;
                head = tail = null;
                size--;
                return;
            } else {
                tail = tail.prev;
                tail.next = head;
                head.prev = tail;
                size--;
            }
        } else {
            DoublyNode tempNode = head;

            for (int i = 0; i < location-1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            tempNode.next.prev = tempNode;
            size--;
        }
    }

    // Delete entire CDLL
    public void deleteCDLL() {
        DoublyNode tempNode  = head;
        for (int i = 0; i<size; i++) {
            tempNode.prev = null;
            tempNode = tempNode.next;
        }
        head = null;
        tail = null;
        size = 0;
        System.out.println("CDLL has been deleted.");
    }

}
