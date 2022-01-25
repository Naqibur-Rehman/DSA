package com.company;

import java.util.Arrays;

public class CoinChange {

    public static void coinChange(int[] coins, int N) {
        Arrays.sort(coins);
        int index = coins.length-1;
        while (true) {
            int coinValue = coins[index];
            index--;
            int maxAmount = (N/coinValue)*coinValue;
            if (maxAmount > 0) {
                System.out.println("Coin value: " + coinValue  +" taken count: " + (N/coinValue));
                N -= maxAmount;
            }
            if (N == 0)
                break;
        }
    }


}
