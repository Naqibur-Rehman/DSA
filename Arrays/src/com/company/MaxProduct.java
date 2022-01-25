package com.company;

public class MaxProduct {
    public static void main(String[] args) {
        int[] intArray = {10, 60, 20, 30, 50};
        String pairs = maxProduct(intArray);
        System.out.println(pairs);
    }

    public static String  maxProduct(int[] arr) {
        int maxP = 0;
        String pairs = "";
        for (int i=0; i< arr.length; i++) {
            for (int j=i+1; j< arr.length; j++) {
                if (arr[i]*arr[j] > maxP) {
                    maxP = arr[i] * arr[j];
                    pairs = Integer.toString(arr[i]) + ", " + Integer.toString(arr[j]);
                }
            }
        }
        return pairs;
    }
}
