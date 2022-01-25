package com.company;

import java.util.ArrayList;

public class QuadraticProbing {
    public String[] hashtable;
    int usedCellNumber;

    public QuadraticProbing(int size) {
        hashtable = new String[size];
        usedCellNumber = 0;
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

    // load factor
    public double getLoadFactor() {
        return usedCellNumber * 1.0/hashtable.length;
    }

    // Rehash
    public void rehashKeys(String word) {
        usedCellNumber = 0;
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

    public void insertInHashTable(String word) {
        double loadFactor = getLoadFactor();
        if (loadFactor >= 0.75) {
            rehashKeys(word);
        } else {
            int index = modASCII(word, hashtable.length);
            int counter = 0;
            for (int i = index; i < index+hashtable.length; i++) {
                int newIndex = (index +(counter*counter)) % hashtable.length;
                if (hashtable[newIndex] == null){
                    hashtable[newIndex] = word;
                    System.out.println(word + " has been inserted");
                    break;
                } else {
                    System.out.println(newIndex + " already occupied trying next one");
                }
                counter++;
            }
        }
    }
}
