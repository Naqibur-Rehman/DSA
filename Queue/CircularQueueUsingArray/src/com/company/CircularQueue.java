package com.company;

public class CircularQueue {
    int[] arr;
    int front;      //beginningOfQueue
    int rear;      //topOfQueue
    int size;

    public CircularQueue(int size) {
        this.arr = new int[size];
        this.size = size;
        this.front = -1;
        this.rear = -1;
        System.out.println("Circular Queue created with size " + size);
    }

    //isEmpty
    public boolean isEmpty() {
        if (rear == -1){
            return true;
        } else {
            return false;
        }
    }

    //isFull
    public boolean isFull() {
        if (rear+1 == front) {
            return true;
        } else if (front == 0 && rear+1 == size) {
            return true;
        } else {
            return false;
        }
    }

    //enQueue
    public void enQueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else if (isEmpty()) {
            front = 0;
            rear++;
            arr[rear] = value;
            System.out.println("Successfully inserted " + value + " in queue");
        }else {
            if (rear+1 == size) {
                rear = 0;
            } else {
                rear++;
            }
            arr[rear] = value;
            System.out.println("Successfully inserted " + value + " in queue");
        }
    }

    //deQueue
    public int deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            int value = arr[front];
            arr[front] = 0;
            if (front == rear) {
                front = rear = -1;
            } else if (front+1 == size) {
                front = 0;
            } else {
                front++;
            }
            return value;
        }
    }

    // peek
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            return arr[front];
        }
    }

    //deleteQueue
    public void deleteQueue() {
        arr = null;
        System.out.println("Queue deleted successfully");
        front = rear = -1;
    }

}
