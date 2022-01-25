package com.company;

public class Permutation {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {5,4,3,6,1};

        System.out.println(isPermutation(array1,array2));
    }

    public static boolean isPermutation(int[] arr1, int[] arr2) {
        int sum1 = 0,sum2 = 0;
        int product1 = 1 , product2 = 1;
        if (arr1.length != arr2.length)
            return false;
        for (int i = 0; i< arr1.length; i++) {
            sum1 += arr1[i];
            sum2 += arr2[i];
            product1 *= arr1[i];
            product2 *= arr2[i];
        }

        return (sum1 == sum2) && (product1 == product2);
    }
}
