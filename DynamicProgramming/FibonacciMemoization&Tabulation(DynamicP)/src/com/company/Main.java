package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<Integer, Integer> memo = new HashMap<>();
        for (int i = 1; i <= 10; i++)
            System.out.println(fibMemo(i,memo));

        System.out.println(fibTab(6));
    }

    // Fibonacci Memoization
    public static int fibMemo(int n, HashMap<Integer, Integer> memo) {
        if (n == 1) return 0;

        if (n == 2) return 1;

        if (!memo.containsKey(n)) {
            memo.put(n, (fibMemo(n-1, memo)+fibMemo(n-2, memo)));
        }

        return memo.get(n);
    }

    // Fibonacci series with tabulation
    public static int fibTab(int n) {
        ArrayList<Integer> table = new ArrayList<>();
        table.add(0);
        table.add(1);
        for (int i = 2; i <= n-1; i++) {
            int n1 = table.get(i-1);
            int n2 = table.get(i-2);
            table.add(n1+n2);
        }
        return table.get(n-1);
    }
}
