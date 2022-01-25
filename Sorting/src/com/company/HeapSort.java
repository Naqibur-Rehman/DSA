package com.company;

public class HeapSort {

    public static void main(String[] args) {
        int[] arr = {2,7,3,1,4,8,9};
        heapSort(arr);
        printArray(arr);
    }

    public static void heapSort(int[] arr) {
        BinaryHeap heap = new BinaryHeap(arr.length);
        for (int val : arr) {
            heap.insertInHeap(val);
        }

        for (int i=0; i< arr.length; i++) {
            arr[i] = heap.extractHeadOfHeap();
        }
    }

    public static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

}
