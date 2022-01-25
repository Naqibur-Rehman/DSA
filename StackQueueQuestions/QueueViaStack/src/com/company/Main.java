package com.company;

public class Main {

    public static void main(String[] args) {
        QueueViaStack queue = new QueueViaStack();
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        System.out.println(queue.deQueue());
        queue.enQueue(4);
        System.out.println(queue.deQueue());
    }
}
