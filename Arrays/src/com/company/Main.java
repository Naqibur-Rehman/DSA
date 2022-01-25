package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        SingleDArray sda = new SingleDArray(3);
//        sda.insert(0,10);
//        sda.insert(1,20);
//        sda.insert(2,30);
//
//        int firstElement = sda.arr[0];
//        System.out.println(firstElement);
//        System.out.println(sda.arr[1]);
//
//        sda.searchInArray(20);
//        sda.searchInArray(40);
//
//        sda.deleteValue(0);
//        System.out.println(sda.arr[0]);

//        int[][] int2DArray = new int[2][2];
//        int2DArray[0][0] = 1;
//        int2DArray[0][1] = 1;
//        int2DArray[1][0] = 1;
//        int2DArray[1][1] = 1;
//
//        System.out.println(Arrays.deepToString(int2DArray));
//
//        String[][] s2DArray = {{"a", "b"}, {"c", "d"}};
//        System.out.println(Arrays.deepToString(s2DArray));

        TwoDArray twoDArray = new TwoDArray(3,3);
        twoDArray.insertValueInTheArray(0,0,10);
        twoDArray.insertValueInTheArray(0,1,20);
        twoDArray.insertValueInTheArray(1,0,30);
        twoDArray.insertValueInTheArray(1,1,40);
//        twoDArray.accessCell(0,1);

//        twoDArray.traverse2DArray();

//        twoDArray.searchingValue(20);
//        twoDArray.searchingValue(50);
        System.out.println(Arrays.deepToString(twoDArray.arr));
        twoDArray.deleteValuefromArray(0,0);
        System.out.println(Arrays.deepToString(twoDArray.arr));
    }
}
