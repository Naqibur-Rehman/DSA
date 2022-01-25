package com.company;

import java.util.Arrays;

public class PairSum {
    public static void main(String[] args) {
        int[] intArray = {2,7,13,15};
//        System.out.println(Arrays.binarySearch(intArray, 7));
        int[] result = twoSum(intArray, 20);
        System.out.println(Arrays.toString(result));
    }

    public static int[] twoSum(int[] arr, int target) {
        for (int i=0; i<arr.length; i++) {
            for (int j=i+1; j<arr.length; j++) {
                if (arr[i]+arr[j] == target) {
                    return new int[] {i,j};
                }
            }
        }
        throw new IllegalArgumentException("No Solution found");
    }
}
