package com.company;

public class ZeroOneKnapsack {

    private int knapsack(int[] profits, int[] weights, int capacity, int currentIndex) {
        if (capacity <= 0 || currentIndex < 0 || currentIndex >= profits.length) {
            return 0;
        }
        int profit1 = 0;
        int profit2 = 0;
        if (weights[currentIndex] <= capacity) {
            profit1 = profits[currentIndex] + knapsack(profits, weights, capacity-weights[currentIndex],
                    currentIndex+1);
            profit2 = knapsack(profits, weights, capacity, currentIndex+1);
        }
        return Math.max(profit1, profit2);
    }

    public int knapsack(int[] profits, int[] weights, int capacity) {
        return knapsack(profits, weights, capacity, 0);
    }

}
