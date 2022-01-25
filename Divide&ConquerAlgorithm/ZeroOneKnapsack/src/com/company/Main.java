package com.company;

public class Main {

    public static void main(String[] args) {
        ZeroOneKnapsack obj = new ZeroOneKnapsack();

        int[] profits = {31,26,17, 72};
        int[] weights = {3,1,2,5};
        int capacity = 7;

        System.out.println(obj.knapsack(profits, weights, capacity));
    }
}
