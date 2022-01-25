package com.company;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {10,9,3,2,5,8,4,1,6,7};
        selectionSort(arr);
        printArray(arr);
    }

    public static void selectionSort(int[] arr) {
        for (int j = 0; j< arr.length; j++) {
            int minIndex = j;
            for (int i= j+1; i<arr.length; i++) {
                if (arr[i] < arr[minIndex]) {
                    minIndex = i;
                }
            }
            if (minIndex != j) {
                int temp = arr[j];
                arr[j] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
