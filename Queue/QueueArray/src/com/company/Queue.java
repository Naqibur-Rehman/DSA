package com.company;

public class Queue {
    int[] arr;
    int front;          // beginningOfQueue
    int rear;           // topOfQueue

    public Queue(int size) {
        this.arr = new int[size];
        this.front = -1;
        this.rear = -1;
        System.out.println("The queue is successfully created with size : " + size);
    }

    // isFull
    public boolean isFull() {
        return rear == arr.length-1;
    }

    // isEmpty
    public boolean isEmpty() {
        return rear == -1 || rear == arr.length;
    }

    //enQueue
    public void enQueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else if (isEmpty()){
            front = rear = 0;
            arr[rear] = value;
            System.out.println("Successfully inserted " + value + " in queue");
        } else {
            rear++;
            arr[rear] = value;
            System.out.println("Successfully inserted " + value + " in queue");
        }
    }

    // deQueue
    public int deQueue() {
        if (isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        } else {
            int value = arr[front];
            front++;
            if (front > rear) {
                front = rear = -1;
            }
            return value;
        }
    }

    //peek
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }

    public void deleteQueue() {
        arr = null;
        front = rear = -1;
        System.out.println("Queue deleted");
    }


}
