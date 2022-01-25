package com.company;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(digitsSum(564));
    }

    public  static int digitsSum(int n) {
        if (n == 0 || n < 0){
            return 0;
        }
        return (n%10) + digitsSum(n/10);
    }
}
