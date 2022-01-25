package com.company;

public class BinaryHeap {
    int[] arr;
    int sizeOfTree;

    public BinaryHeap(int size) {
        arr = new int[size + 1];
        this.sizeOfTree = 0;
        System.out.println("Binary Heap has been created");
    }

    // isEmpty
    public boolean isEmpty() {
        return sizeOfTree == 0;
    }

    // peek
    public int peek() {
        if (isEmpty()) {
            System.out.println("Binary heap is empty");
            return -1;
        }
        return arr[1];
    }

    // size
    public int size() {
        return sizeOfTree;
    }

    // swap
    private void swap(int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    // levelOrder traversal
    public void levelOrder() {
        for (int i = 1; i <= sizeOfTree; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Heapify for insert  ==> bottom to top
    public void heapifyBottomToTop(int index, String heapType) {
        int parent = index / 2;
        if (index <= 1)
            return;
        if (heapType.equalsIgnoreCase("min")) {
            if (arr[index] < arr[parent]) {
//                int temp = arr[index];
//                arr[index] = arr[parent];
//                arr[parent] = temp;
                swap(index, parent);
            }
        } else if (heapType.equalsIgnoreCase("Max")) {
            if (arr[index] > arr[parent]) {
//                int temp = arr[index];
//                arr[index] = arr[parent];
//                arr[parent] = temp;
                swap(index, parent);
            }
        }

        heapifyBottomToTop(parent, heapType);

    }

    // insert method
    public void insert(int value, String heapType) {
        sizeOfTree++;
        arr[sizeOfTree] = value;
        heapifyBottomToTop(sizeOfTree, heapType);
        System.out.println("inserted " + value + " successfully");
    }

    // heapify for extract node ==> top to bottom
    public void heapifyTopToBottom(int index, String heapType) {
        int left = index * 2;
        int right = index * 2 + 1;
        int swapChild  = 0;
        if (sizeOfTree < left)
            return;
        if (heapType.equalsIgnoreCase("max")) {
            if (sizeOfTree == left) {               // one child
                if (arr[index] < arr[left]) {
//                    int temp = arr[index];
//                    arr[index] = arr[left];
//                    arr[left] = temp;
                    swap(index, left);
                }
                return;
            } else {                                // two child
                if (arr[left] > arr[right]) {
                    swapChild = left;
                } else {
                    swapChild = right;
                }
                if (arr[index] < arr[swapChild]) {
//                    int temp = arr[index];
//                    arr[index] = arr[swapChild];
//                    arr[swapChild] = temp;
                    swap(index, swapChild);
                }
            }
        } else if (heapType.equalsIgnoreCase("min")) {
            if (sizeOfTree == left) {               // one child
                if (arr[index] > arr[left]) {
//                    int temp = arr[index];
//                    arr[index] = arr[left];
//                    arr[left] = temp;
                    swap(index, left);
                }
                return;
            } else {                                // two child
                if (arr[left] < arr[right]) {
                    swapChild = left;
                } else {
                    swapChild = right;
                }
                if (arr[index] > arr[swapChild]) {
//                    int temp = arr[index];
//                    arr[index] = arr[swapChild];
//                    arr[swapChild] = temp;
                    swap(index, swapChild);
                }
            }
        }
        heapifyTopToBottom(swapChild, heapType);
    }

    // extract method
    public int extractRoot(String heapType) {
        if (isEmpty())
            return -1;
        int extract = arr[1];
        arr[1] = arr[sizeOfTree];
        sizeOfTree--;
        heapifyTopToBottom(1, heapType);
        return extract;
    }

    // delete binary heap
    public void deleteHeap() {
        arr = null;
        System.out.println("binary heap deleted");
    }

}