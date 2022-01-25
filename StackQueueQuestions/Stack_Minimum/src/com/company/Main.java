package com.company;

public class Main {

    public static void main(String[] args) {
        StackMin stack = new StackMin();
        stack.push(3);
        stack.push(2);
        stack.push(5);
        stack.push(1);
        System.out.println(stack.min());

        stack.pop();
        System.out.println(stack.min());

    }
}
