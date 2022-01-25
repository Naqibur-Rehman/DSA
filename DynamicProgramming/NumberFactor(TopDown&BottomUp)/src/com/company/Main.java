package com.company;

public class Main {

    public static void main(String[] args) {
        NumberFactor nf = new NumberFactor();
        System.out.println(nf.waysToGetNTopDown(4));
        System.out.println(nf.waysToGetNTopDown(5));
        System.out.println(nf.waysToGetNTopDown(6));
        System.out.println(nf.waysToGetNBottomUp(4));
        System.out.println(nf.waysToGetNBottomUp(5));
        System.out.println(nf.waysToGetNBottomUp(6));
    }
}
