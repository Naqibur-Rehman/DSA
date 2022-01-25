package com.company;

public class Main {

    public static void main(String[] args) {
//         BubbleSort bs  = new BubbleSort();
//          int[] arr = {10, 5, 30, 15, 50, 6};
//          bs.bubbleSort(arr);
//          bs.printArray(arr);

        int[] arr = {9,7,5,4,2,1,3,6,8};
        BucketSort bucketSort = new BucketSort(arr);
        bucketSort.printArray();
        bucketSort.bucketSort();
        bucketSort.printArray();
    }
}
