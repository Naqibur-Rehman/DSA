package com.company;

public class HouseRobber {

    public static void main(String[] args) {
        int[] houseNetWorth = {6,7,1,30,8,2,4};
        System.out.println(maxMoney(houseNetWorth));
    }

    private static int maxMoneyRecursive(int[] houseNetWorth, int currentIndex) {
        if (currentIndex >= houseNetWorth.length)
            return 0;

        int stealCurrentHouse = houseNetWorth[currentIndex] + maxMoneyRecursive(houseNetWorth, currentIndex+2);
        int skipCurrentHouse = maxMoneyRecursive(houseNetWorth, currentIndex+1);

        return Math.max(stealCurrentHouse,skipCurrentHouse);
    }

    public static int maxMoney(int[] houseNetWorth) {
        return maxMoneyRecursive(houseNetWorth,0);
    }
}
