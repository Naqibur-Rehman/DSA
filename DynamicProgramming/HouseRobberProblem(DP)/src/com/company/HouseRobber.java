package com.company;

public class HouseRobber {

    // TopDown Approach

    private int maxMoneyRecursive(int[] houses, int currentIndex, int[] dp) {
        if (currentIndex >= houses.length)
            return 0;

        if (dp[currentIndex] != houses[currentIndex]) {
            int stealCurrentHouse = houses[currentIndex] + maxMoneyRecursive(houses, currentIndex + 2, dp);
            int skipCurrentHouse = maxMoneyRecursive(houses, currentIndex + 1, dp);
            dp[currentIndex] = Math.max(stealCurrentHouse,skipCurrentHouse);
        }
        return dp[currentIndex];
    }

    public int maxMoneyTopDown(int[] houseNetWorth) {
        int[] dp = new int[houseNetWorth.length];
        return maxMoneyRecursive(houseNetWorth,0, dp);
    }

    // BottomUP Approach

    public int maxMoneyBottomUp(int[] houses) {
        int[] dp = new int[houses.length];
        dp[0] = houses[0];
        dp[1] = Math.max(houses[0], houses[1]);
        for (int i = 2; i < dp.length; i++) {
            dp[i] = Math.max(houses[i] + dp[i-2], dp[i-1]);
        }
        return dp[dp.length-1];
    }

}
