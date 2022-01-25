package com.company;

public class Main {

    public static void main(String[] args) {
        HouseRobber hb = new HouseRobber();
        int[] houseNetWorth = {6,7,1,30,8,2,4};
        System.out.println(hb.maxMoneyTopDown(houseNetWorth));
        System.out.println(hb.maxMoneyBottomUp(houseNetWorth));
    }
}
