package com.company;

public class Main {

    public static void main(String[] args) {

        SetOfStacks stack = new SetOfStacks(3);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack.popAt(0));
        System.out.println(stack.popAt(1));
    }
}
