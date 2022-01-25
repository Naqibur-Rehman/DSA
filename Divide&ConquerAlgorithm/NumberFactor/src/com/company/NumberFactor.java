package com.company;

public class NumberFactor {
    public static void main(String[] args) {

        System.out.println(waysToGetN(4));
        System.out.println(waysToGetN(5));
        System.out.println(waysToGetN(6));

    }

    public static int waysToGetN(int n) {
        if(n==0 || n==1 || n==2) {
            return 1;       // 1 ways
        }
        if (n==3) {
            return 2;     //{1,1,1} ,{3}  2 ways
        }
        int sub1 = waysToGetN(n-1);
        int sub2 = waysToGetN(n-3);
        int sub3 = waysToGetN(n-4);

        return sub1+sub2+sub3;
    }
}
