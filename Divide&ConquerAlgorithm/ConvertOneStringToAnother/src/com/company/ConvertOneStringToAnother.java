package com.company;

public class ConvertOneStringToAnother {

    public static void main(String[] args) {
        System.out.println(findMinOperations("table", "tbres"));
    }

    private static int findMinOperations(String s1, String s2, int index1, int index2) {
        if (index1 == s1.length()) {
            return s2.length() - index2;
        }
        if (index2 == s2.length()) {
            return s1.length() - index1;
        }
        if (s1.charAt(index1) == s2.charAt(index2)) {
            return findMinOperations(s1, s2, index1+1, index2+2);
        }

        int deleteOP = 1 + findMinOperations(s1, s2, index1+1, index2);
        int insertOp = 1 + findMinOperations(s1, s2, index1, index2+1);
        int replaceOp = 1 + findMinOperations(s1, s2, index1+1, index2+1);

        return Math.min(deleteOP, Math.min(insertOp, replaceOp));
    }

    public static int findMinOperations(String s1, String s2) {
        return findMinOperations(s1, s2, 0, 0);
    }

}
