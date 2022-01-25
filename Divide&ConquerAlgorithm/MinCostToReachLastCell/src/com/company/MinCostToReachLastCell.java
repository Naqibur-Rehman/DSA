package com.company;

public class MinCostToReachLastCell {

    public static void main(String[] args) {
        int[][] arr = {
                {4, 7, 8, 6, 4},
                {6, 7, 3, 9, 2},
                {3, 8, 1, 2, 4},
                {7, 1, 7, 3, 7},
                {2, 9, 8, 9, 3}
        };

        System.out.println(findMinCost(arr, arr.length-1, arr[0].length-1));
    }

    public static int findMinCost(int[][] arr, int row, int col) {
        if (row == -1 || col == -1) return Integer.MAX_VALUE;

        if (row == 0 && col == 0)    return arr[0][0];

        int minCost1 = findMinCost(arr, row, col-1);
        int minCost2 = findMinCost(arr, row-1, col);

        int minCost = Integer.min(minCost1,minCost2);
        return minCost + arr[row][col];

    }

}
