package com.company;

public class Main {

    public static void main(String[] args) {

        CircularQueue circularQueue = new CircularQueue(3);
        System.out.println(circularQueue.isEmpty());
        System.out.println(circularQueue.isFull());
        circularQueue.enQueue(10);
        circularQueue.enQueue(20);
        circularQueue.enQueue(30);
        circularQueue.enQueue(40);
        System.out.println(circularQueue.isEmpty());
        System.out.println(circularQueue.isFull());

//        System.out.println(circularQueue.deQueue());
//        System.out.println(circularQueue.deQueue());
//        System.out.println(circularQueue.deQueue());
//        System.out.println(circularQueue.deQueue());

        System.out.println(circularQueue.peek());
        System.out.println(circularQueue.peek());

        circularQueue.deleteQueue();


    }
}
