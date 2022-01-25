package com.company;

public class Stack {
    LinkedList linkedList;

    public Stack() {
        linkedList = new LinkedList();
    }

    // push
    public void push(int value) {
        linkedList.insertInLinkedList(value, 0);
        System.out.println("Inserted " + value + " in stack");
    }

    // isEmpty
    public boolean isEmpty() {
        return linkedList.head == null;
    }

    // pop method
    public int pop() {
        int value = -1;
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return value;
        } else {
            value = linkedList.head.value;
            linkedList.deleteNode(0);
            return value;
        }
    }

    // peek
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return linkedList.head.value;
        }
    }

    // delete stack method
    public void deleteStack() {
        linkedList.head = null;
        System.out.println("Stack is deleted");
    }


}
