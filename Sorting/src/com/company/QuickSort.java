package com.company;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {10,3,2,5,8,4,3,1,2,9,7,8};
        quickSort(arr, 0, arr.length-1);
        printArray(arr);
    }

    // partition method
    public static int partition(int[] array, int start, int end) {
        int pivot = end;
        int i = start-1;
        for (int j = start; j <= end; j++) {
            if (array[j] <= array[pivot]){
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        return i;
    }

    // quickSort meethod
    public static void quickSort(int[] array, int start, int end) {
        if (start < end) {
            int pivot = partition(array,start,end);
            quickSort(array, start, pivot-1);
            quickSort(array, pivot +1, end);
        }
    }

    public static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
