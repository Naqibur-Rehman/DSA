package com.company;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] intArray = {1,2,3,3,5,6};
        System.out.println(isUnique(intArray));
    }

    public static boolean isUnique (int[] arr) {
        for (int i=0; i<arr.length; i++) {
            for (int j = i+1; j< arr.length; j++) {
                if (arr[i] == arr[j])
                    return false;
            }
        }
        return true;
    }
}
