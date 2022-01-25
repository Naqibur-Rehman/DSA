package com.company;

public class Stack {
    int[] arr;
    int topOfStack;

    public Stack(int size) {
        this.arr = new int[size];
        this.topOfStack = -1;
        System.out.println("The stack created with size of " + size);
    }

    // isEmpty method
    public boolean isEmpty() {
//        if (topOfStack == -1){
//            return true;
//        }
//        return false;

        //  or simplified
        return topOfStack == -1;
    }

    // isFull method
    public boolean isFull() {
//        if (this.topOfStack == this.arr.length - 1) {
//            return true;
//        } else {
//            return false;
//        }
        return this.topOfStack == this.arr.length - 1;
    }

    // push
    public void push(int value) {
        if (isFull()) {
            System.out.println("The stack is full");
        } else {
            this.topOfStack++;
            arr[this.topOfStack] = value;
            System.out.println("The value is successfully inserted");
        }
    }

    // pop
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            int value = this.arr[this.topOfStack];
            this.topOfStack--;
            return value;
        }
    }

    // peek
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return this.arr[this.topOfStack];
        }
    }

    // delete stack
    public void deleteStack() {
        arr = null;
        topOfStack = -1;
        System.out.println("The stack is successfully deleted");
    }
}
