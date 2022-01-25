package com.company;

import java.util.ArrayList;

public class DoubleHashing {
    public String[] hashtable;
    int numberOfCellsUsed;

    public DoubleHashing(int size) {
        hashtable = new String[size];
        numberOfCellsUsed = 0;
    }

    // display hash table
    public void displayHashTable() {
        if (hashtable == null) {
            System.out.println("Hash Table doesn't exist");
            return;
        } else {
            System.out.println("\n ================= Hash Table =============");
            for (int i = 0; i<hashtable.length; i++) {
                System.out.println("Index " + i + " , Key: " + hashtable[i]);
            }
        }
        System.out.println();
    }

    // hash function
    public int modASCII(String word, int M) {
        char[] ch;
        ch = word.toCharArray();
        int i, sum = 0;
        for (i=0; i<word.length(); i++) {
            sum += ch[i];
        }
        return sum % M;
    }

    // Rehash
    public void rehashKeys(String word) {
        numberOfCellsUsed = 0;
        ArrayList<String> data = new ArrayList<>();
        for (String s : hashtable) {
            if (s != null) {
                data.add(s);
            }
        }
        data.add(word);
        hashtable = new String[hashtable.length * 2];
        for (String s : data) {
            insertInHashTable(s);
        }
    }

    private int addAllDigitsTogether(int sum) {
        int value= 0;
        while (sum > 0) {
            value = sum % 10;
            sum /= 10;
        }
        return value;
    }

    public int secondHash(String word, int M) {
        char[] ch;
        ch = word.toCharArray();
        int i, sum=0;
        for (i = 0; i<word.length(); i++) {
            sum += ch[i];
        }
        while (sum > hashtable.length) {
            sum = addAllDigitsTogether(sum);
        }
        return sum % M;
    }

    // load factor
    public double getLoadFactor() {
        return numberOfCellsUsed * 1.0/hashtable.length;
    }

    public void insertInHashTable(String word) {
        double loadFactor = getLoadFactor();
        if (loadFactor >= 0.75) {
            rehashKeys(word);
        } else {
            int x = modASCII(word, hashtable.length);
            int y = secondHash(word, hashtable.length);
            for (int  i= 0; i<hashtable.length; i++) {
                int newIndex = (x + i*y) % hashtable.length;
                if (hashtable[newIndex] ==  null) {
                    hashtable[newIndex] = word;
                    System.out.println(word + " inserted at location " + newIndex);
                    break;
                } else {
                    System.out.println(newIndex + " already occupied trying next cell");
                }
            }
        }
        numberOfCellsUsed++;
    }

}
