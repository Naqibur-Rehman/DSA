package com.company;

public class LongestPalindromicSubsequence {

    private int findLPSLength(String str, int startIndex, int endIndex) {
        if (startIndex > endIndex)  return 0;
        if (startIndex == endIndex)    return 1;

        int c1 = 0;
        if (str.charAt(startIndex) == str.charAt(endIndex)) {
            c1 = 2 + findLPSLength(str, startIndex+1, endIndex-1);
        }
        int c2 = findLPSLength(str, startIndex+1, endIndex);
        int c3 = findLPSLength(str, startIndex, endIndex-1);

        return Math.max(c1, Math.max(c2,c3));
    }

    public int findLPSLength(String str) {
        return findLPSLength(str, 0, str.length()-1);
    }
}
