package com.company;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {10,3,2,5,8,4,3,1,2,9,7,8};
        mergeSort(arr, 0, arr.length-1);
        printArray(arr);
    }

    public static void merge(int[] arr, int left, int middle, int right) {
        int[] leftTempArray = new int[middle - left + 2];
        int[] rightTempArray = new int[right - middle + 1];

        for (int  i = 0; i <= middle - left; i++) {
            leftTempArray[i] = arr[left+i];
        }

        for (int i= 0; i< right - middle; i++) {
            rightTempArray[i] = arr[middle+1+i];
        }

        leftTempArray[middle-left+1] = Integer.MAX_VALUE;
        rightTempArray[right - middle] = Integer.MAX_VALUE;

        int i = 0, j = 0;
        for (int k = left; k <= right; k++) {
            if (leftTempArray[i] < rightTempArray[j]) {
                arr[k] = leftTempArray[i];
                i++;
            } else {
                arr[k] = rightTempArray[j];
                j++;
            }
        }
    }

    public static void  mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = (left+right) /2;
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);
            merge(array, left, mid, right);
        }
    }

    public static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
