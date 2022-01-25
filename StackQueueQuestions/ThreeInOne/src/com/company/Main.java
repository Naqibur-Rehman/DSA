package com.company;

public class Main {

    public static void main(String[] args) {

        ThreeInOne stack = new ThreeInOne(3);
//        System.out.println(stack.isFull(0));
//        System.out.println(stack.isFull(1));
//        System.out.println(stack.isFull(2));
//        System.out.println(stack.isEmpty(2));
//        System.out.println(stack.isEmpty(1));
//        System.out.println(stack.isEmpty(0));

        stack.push(0, 1);
        stack.push(0, 2);
        stack.push(1, 4);
        stack.push(1, 5);
        stack.push(2, 8);

        System.out.println(stack.pop(0));
        System.out.println(stack.pop(2));
        System.out.println(stack.pop(2));
        System.out.println(stack.peek(0));
        System.out.println(stack.peek(1));
        System.out.println(stack.peek(1));
    }
}
