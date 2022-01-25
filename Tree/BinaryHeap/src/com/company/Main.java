package com.company;

public class Main {

    public static void main(String[] args) {
        BinaryHeap heap = new BinaryHeap(5);
        heap.peek();
        heap.insert(10, "max");
        heap.insert(5, "MAx");
        heap.insert(15, "Max");
        heap.insert(1, "maX");
        heap.levelOrder();

        System.out.println(heap.peek());

        System.out.println(heap.extractRoot("max"));
        heap.levelOrder();



        heap.deleteHeap();
//        heap.levelOrder();
    }
}
