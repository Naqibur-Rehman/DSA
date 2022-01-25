package com.company;

import java.util.Stack;

public class QueueViaStack {

    Stack<Integer> stackNewest, stackOldest;

    public QueueViaStack() {
        this.stackNewest = new Stack<>();
        this.stackOldest = new Stack<>();
    }

    public int size() {
        return stackNewest.size() + stackOldest.size();
    }

    public void enQueue(int value) {
        stackNewest.push(value);
    }

    private void shiftStack() {
        if (stackOldest.isEmpty()) {
            while (!stackNewest.isEmpty()) {
                int poppedOut = stackNewest.pop();
                stackOldest.push(poppedOut);
            }
        }
    }

    public int deQueue() {
        shiftStack();
        return stackOldest.pop();
    }

    public int peek() {
        shiftStack();
        return stackOldest.peek();
    }

}
